package Movie;

import java.util.HashMap;
import java.util.Scanner;

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
		HashMap<Integer, Movie> result = mc.searchTitle(sct);
		if (result.isEmpty()) {
			System.out.println("검색 결과에 해당하는 영화가 없습니다.");
			return;
		} else {
			result.forEach((Integer, Movie) -> {
				System.out.println(Integer + "/ " + Movie.toString());
			});
		}
	} 
	
	public void searchGenre() { //장르로 검색
		System.out.println("===== 장르로 검색 =====");
		System.out.print("검색할 키워드를 입력하여 주세요. : ");
		String scg = sc.nextLine();
		HashMap<Integer, Movie> result = mc.searchGenre(scg);
		if (result.isEmpty()) {
			System.out.println("검색 결과에 해당하는 영화가 없습니다.");
			return;
		} else {
			result.forEach((Integer, Movie) -> {
				System.out.println(Integer + "/ " + Movie.toString());
			});
		}
	}
	
	public void searchAge() { //연령 제한으로 검색
		System.out.println("===== 연령 제한으로 검색 =====");
		System.out.print("검색할 키워드를 입력하여 주세요. : ");
		int sca = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, Movie> result = mc.searchAge(sca);
		if (result.isEmpty()) {
			System.out.println("검색 결과에 해당하는 영화가 없습니다.");
			return;
		} else {
			result.forEach((Integer, Movie) -> {
				System.out.println(Integer + "/ " + Movie.toString());
			});
		}
	}
	
	public void reserveTicket() { //영화 예매
		System.out.println("===== 영화 예매 =====");
		mc.MovieList();
		System.out.print("예매하실 영화의 번호를 입력하세요. : ");
		int serial = sc.nextInt();
		sc.nextLine();
		Movie m = mc.checkMovie(serial);
		if (m == null) {
			System.out.println("목록에 존재하지 않는 번호입니다.");
			return;
		}
		
		System.out.println("연령 검사 중...");
		boolean ckage = mc.checkAge(m);
		if(ckage == false) {
			System.out.println(m.getAccessAge() + "세 미만 관람불가 영화입니다.");
			return;
		}
		
		System.out.println("매진 확인 중...");
		boolean ckabl = mc.checkAvailable(m);
		if (ckabl == false) {
			System.out.println("이미 매진된 영화입니다.");
			return;
		}
		
		System.out.print("예매하실 영화표의 수를 입력해주세요. : ");
		int ticket = sc.nextInt();
		sc.nextLine();
		boolean restck = mc.reserveTicket(serial, ticket);
		if (restck == false) {
			System.out.println("남은 영화표의 수가 부족합니다.");
			return;
		} else {
			System.out.println("티켓이 예매되었습니다.");
		}
		
	}
	
	public void reserveList() { //예매한 영화 목록
		System.out.println("====== 예매한 영화 목록 ======");
		mc.ReserveList();
	}
	
	public void reserveCancel() { //예매 취소
		System.out.println("====== 예매 취소 ======");
		mc.ReserveList();
		System.out.print("예매를 취소하실 영화의 번호를 입력해주세요. : ");
		int serial = sc.nextInt();
		sc.nextLine();
		
		boolean rescan = mc.reserveCancel(serial);
		if (rescan == false) {
			System.out.println("예매 목록에 포함되어 있지 않은 영화입니다.");
			return;
		} else {
			System.out.println("예매가 취소되었습니다.");
		}
	}
}
