package com.kh.practice01;

import java.util.Scanner;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int select = sc.nextInt();
			
			switch(select){
			case 1:
				this.tokenMenu();
				break;
			case 2:
				this.inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String aftstr = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + aftstr);
		System.out.println("토큰 처리 후 개수 : " + aftstr.length());
		System.out.println("모두 대문자로 변환 : " + aftstr.toUpperCase());
	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.next();
		
		String Input = tc.firstCap(input);
		
		System.out.println("첫 글자 대문자 : " + Input);
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char search = sc.next().charAt(0);
		System.out.println(search + " 문자가 들어간 개수 : " + tc.findChar(Input, search));
	}
}
