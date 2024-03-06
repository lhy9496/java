package com.kh.Test2401232;

import java.util.Scanner;

public class Library {
	//도서관리프로그램
	Book[] bookArr;
	Scanner sc;
	
	public Library() {
		this.bookArr = new Book[100]; // bookArr는 Book 참조변수 100개를 가지고 있는 배열
		this.sc = new Scanner(System.in);
	}
	
	public void startLibrary() {
		
		int choice = 0;
		while(choice != 9) {
			System.out.println("==================== 도서관리프로그램 ====================");
			System.out.println("1. 도서등록");
			System.out.println("2. 모든 도서 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				this.insertBook();//도서등록
				break;
			case 2:
				this.allPrintBook();
				break;
			case 9:
				this.shutDown();
				break;
			}
		
			
				
		}
	}
	public void insertBook() {
		String title, author, date;
		int number;
		System.out.println("==================== 도서등록 ====================");
		System.out.print("제목 : ");
		title = sc.next();
		
		System.out.print("작가 : ");
		author = sc.next();
		
		System.out.print("발행일 : ");
		date = sc.next();
		
		System.out.print("책 번호 : ");
		number = sc.nextInt();
		
		int i = 0;
		boolean isEq = false; // 중복 여부 확인용 변수 (false = 중복 없음)
		
		while(bookArr[i] != null) {
			if (title.equals(bookArr[i].getTitle())) {
				System.out.println("같은 제목의 도서가 있습니다.");
				isEq = true; // 중복을 찾았다는 정보 저장
				break;
			}
			i++;
		}
		if (!isEq) { // 중복이 없으면 객체 생성
			bookArr[i] = new Book(title, author, date, number);
			System.out.println("도서 등록 완료");
			System.out.println(bookArr[i].toString());
		}
		
				
				
	}
	
	public void allPrintBook() {
		System.out.println("==================== 모든 도서 출력 ====================");
		for (int i = 0; bookArr[i] != null; i++) {
			System.out.println(bookArr[i].toString());
		}
	}

	public void shutDown() {
		System.out.println("프로그램 종료");
	}
}

