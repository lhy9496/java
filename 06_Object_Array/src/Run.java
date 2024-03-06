import java.util.Scanner;

public class Run {
	/*
	 * 객체배열
	 * 	객체를 저장하는 배열로 일반적인 배열과 다르게
	 * 	배열의 각 요소가 참조변수로 이루어져 있다. -> 사용을 위해서는 각 요소마다 객체생성이 필요하다.
	 * 
	 * [표현법]
	 * 클래스명[] 배열명 = new 클래스명[크기]; -> 크기가 n개인 참조변수 배열생성
	 * 배열명[index] = new 클래스명(); -> 각 인덱스 객체생성
	 */
	public static void main(String[] args) {
		/*
		Human[] Humanarr = new Human[3]; // -> [o,o,o]
		Humanarr[0] = new Human("최지원", 21, 'i');
		Humanarr[1] = new Human("김수민", 44, 'j');
		Humanarr[2] = new Human("강호동", 12, 'k');
		
		for (int i = 0; i < Humanarr.length; i++) {
			Humanarr[i].print();
			System.out.println();
		}
		
		Human[] Humanarr2 = {new Human("최지원", 21, 'i'),
							new Human("김수민", 44, 'j'),
							new Human("강호동", 12, 'k')};
		*/
		
		/*
		 *  도서관에서 책을 관리하는 프로그램을 만든다고 가정하자.
		 *  해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성할 Book 클래스이다.
		 *  필요하다고 생각하는 데이터와 기능을 구현해보자.
		 *  
		 *  Book book1 = new Book(초기화변수);
		 */
		
		//사용자로부터 제목, 장르, 저자, 책 번호를 입력받아
		//book 객체를 생성하고 생성된 객체의 toString메소드를 호출하여 정보를 확인하라.
		Scanner sc = new Scanner(System.in);
		
		Book[] bookArr = new Book[100];
		
		int count = 0, menu = 0;

		
		
		while (menu != 9) {
			System.out.println("====================도서관리프로그램===================");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("3. 도서검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택()");
			menu = sc.nextInt();
		
			switch(menu) {
			case 1:{
				System.out.println("==========도서 등록==========");
				String title, genre, author;
				int number;
				
				System.out.print("도서 제목 : ");
				title = sc.next();
				
				System.out.print("장르 : ");
				genre = sc.next();
				
				System.out.print("저자 : ");
				author = sc.next();
				
				System.out.print("책 번호 : ");
				number = sc.nextInt();
				
				bookArr[count] = new Book(title, genre, author, number);
				System.out.println("도서등록 완료 : " + bookArr[count++].toString());
			}break;
			case 2:{
				System.out.println("==========등록된 도서정보==========");
				if (bookArr[0] == null) {
					System.out.println("등록된 도서가 없습니다.");
					break;
				}
				for (int i = 0; i < bookArr.length; i++) {
					if (bookArr[i] == null)
						break;
					System.out.println(bookArr[i].toString());
				}
			}break;
			case 3:{
				System.out.println("==========도서 검색==========");
				System.out.print("검색할 도서 제목 : ");
				String title = sc.next();
				Book target = null;
				
				for (int i = 0; i < bookArr.length; i++) {
					if (bookArr[i] == null) {
						break;
					} else if(bookArr[i].getTitle().equals(title)) {
						target = bookArr[i];
						break;
					}
				}
				if (target == null) {
					System.out.println("동일한 제목의 도서가 없습니다.");
				} else {
					System.out.println("검색 도서 정보 : " + target.toString());
				}
			}break;
			case 9:{
				System.out.println("프로그램을 종료합니다.");
			}break;
		
		//배열 bookArr에 등록된 모든 도서정보 출력
		//등록된 도서정보
		//Book [title = 홍길동전 genre = 소설 author = 허균 number = 1]


		}
		
	}
	}
	
}
