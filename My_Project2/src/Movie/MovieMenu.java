package Movie;

import java.util.HashMap;
import java.util.Scanner;
import Movie.Member;
import Movie.jdbc.MovieService;

public class MovieMenu {
	Scanner sc = new Scanner(System.in);
	MovieController mc = new MovieController();
	
	public void mainMenu() { //메인 메뉴
		
		System.out.println("====회원 정보 입력====");

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.entryMember(name, age);
		
		while(true) {
			
			System.out.println("\n회원 정보 <" + mc.meminfo().toString() + ">\n");
			
			System.out.println("====== 영화 ======");
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 검색");
			System.out.println("3. 영화 예매");
			System.out.println("4. 예매한 영화 목록");
			System.out.println("5. 예매 취소");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			
			switch(select) {
			case 1:
				this.MovieList();
				break;
			case 2:
				this.searchMovie();
				break;
			case 3:
				this.reserveTicket();
				break;
			case 4:
				this.reserveList();
				break;
			case 5:
				this.reserveCancel();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 시도하세요.");	
			}
		}
	}
	
	public void MovieList() { //영화 목록
		System.out.println("====== 영화 목록 ======");
		mc.MovieList();
	}
	
	public void searchMovie() { //영화 검색
		System.out.println("===== 영화 검색 =====");
		System.out.println("1. 제목으로 검색");
		System.out.println("2. 장르로 검색");
		System.out.println("3. 연령 제한으로 검색");
		
		System.out.print("메뉴 선택 : ");
		int select = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
		switch(select) {
		case 1:
			this.searchTitle();
			break;
		case 2:
			this.searchGenre();
			break;
		case 3:
			this.searchAge();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 메인 메뉴부터 다시 시도하세요.");
		}
	}
	
	public void searchTitle() { //제목으로 검색
		System.out.println("===== 제목으로 검색 =====");
		System.out.print("검색할 키워드를 입력하여 주세요. : ");
		String sct = sc.nextLine();
		mc.searchTitle(sct);
		
	}
	
	public void searchGenre() { //장르로 검색
		System.out.println("===== 장르로 검색 =====");
		System.out.print("검색할 키워드를 입력하여 주세요. : ");
		String scg = sc.nextLine();
		mc.searchGenre(scg);
		
	}
	
	public void searchAge() { //연령 제한으로 검색
		System.out.println("===== 연령 제한으로 검색 =====");
		System.out.print("검색할 키워드를 입력하여 주세요. : ");
		int sca = sc.nextInt();
		sc.nextLine();
		mc.searchAge(sca);
		
	}
	
	public void reserveTicket() { //영화 예매
		System.out.println("===== 영화 예매 =====");
		boolean mvlist = mc.MovieList();
		if(mvlist == false) {
			return;
		}
		System.out.print("예매하실 영화의 번호를 입력하세요. : ");
		int serial = sc.nextInt();
		sc.nextLine();
		Movie m = mc.checkMovie(serial);
		if (m == null) {
			System.out.println("목록에 존재하지 않는 영화입니다.");
			return;
		}
		Movie r = mc.checkReserve(serial);
		if (m.getTitle().equals(r.getTitle())) {
			System.out.println("===== 추가 예매 =====");
			System.out.print("연령 검사 중...");
			boolean ckage = mc.checkAge(m);
			if(ckage == false) {
				System.out.println(m.getAccessAge() + "세 미만 관람불가 영화입니다.");
				return;
			}
			System.out.println();
			
		} else {
			System.out.println("===== 신규 예매 =====");
		}
		
		System.out.print("좌석 수 확인 중...");
		boolean ckabl = mc.checkAvailable(m);
		if (ckabl == false) {
			System.out.println("이미 매진된 영화입니다.");
			return;
		}
		System.out.println();
		
		System.out.print("예매하실 영화표의 수를 입력해주세요. : ");
		int ticket = sc.nextInt();
		sc.nextLine();
		mc.reserveTicket(serial, m, ticket);
	}
	
	public void reserveList() { //예매한 영화 목록
		System.out.println("====== 예매한 영화 목록 ======");
		mc.ReserveList();
	}
	
	public void reserveCancel() { //예매 취소
		System.out.println("====== 예매 취소 ======");
		mc.ReserveList();
		if(new MovieService().ReserveList().isEmpty()){
			return;
		}
		System.out.print("예매를 취소하실 영화의 번호를 입력해주세요. : ");
		int serial = sc.nextInt();
		sc.nextLine();
		
		mc.reserveCancel(serial);
	}
	
	// 응답화면
	
	/**
	 * 
	 * 서비스요청 처리 후 성공했을 경우 사용자가 보게될 응답화면
	 * @param message: 객체별 성공메세지
	 */
	public void displaySuccess(String message) {
		System.out.println("\n서비스 요청 성공 : " + message);
	}
	/**
	 * 서비스요청 처리 후 실패했을 경우 사용자가 보게될 응답화면
	 * @param message: 객체별 실패메세지
	 */
	public void displayFail(String message) {
		System.out.println("\n서비스 요청 실패 : " + message);
	}
	
	/**
	 * 조회서비스 요청시 조회 결과가 없을 경우 사용자가 보게될 응답화면
	 * @param list: 조회 결과에 대한 응답 메세지
	 */
	public void displayNoData(String message) {
		System.out.println("\n" + message);
	}
	
	/**
	 * 조회서비스 요청시 조회 결과가 여러 행일 경우 사용자가 보게될 응답화면
	 * @param list: 조회 결과에 대한 응답 메세지
	 */
	public void displayMovieList(HashMap<Integer, Movie> map) {
		map.forEach((Integer, Movie) -> {
			System.out.println(Integer + "/ " + Movie);
		});
	}
}
