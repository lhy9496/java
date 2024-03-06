package Polytest;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc; 
	Scanner sc;
	
	public LibraryMenu() {
		super();
		lc = new LibraryController();
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().toLowerCase().charAt(0);
		
		Member m = new Member(name, age, gender, 0);
		lc.insertMember(m);
		
		int select = 0;
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println(lc.myinfo());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0; bList[i] != null; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		lc.searchBook(keyword);
	}
	
	public void rentBook() {
		this.selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		lc.rentBook(index);
	}
}
