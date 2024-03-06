package com.kh.Test240123;

import java.util.Scanner;

public class Run {
	public static void main (String[] args) {
		// 사용자로부터 이름, 수학점수/국어점수/영어점수를 입력받아
		// 평균을 구하세요
		
//		Scanner sc = new Scanner(System.in);
		
//		String name;
//		int math, kor, eng;
//		
//		System.out.print("이름 : ");
//		name = sc.nextLine();
//		
//		System.out.print("수학점수 : ");
//		math = sc.nextInt();
//		
//		System.out.print("국어점수 : ");
//		kor = sc.nextInt();
//		
//		System.out.print("영어점수 : ");
//		eng = sc.nextInt();
//		
//		System.out.println("평균 점수 : " + (float)(math + kor + eng)/3);
		
		// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student 클래스를 작성하세요.
		// 평균을 구하는 메소드를 포함하여 작성합니다.
		
//		Student lee = new Student("이호연", 75, 90, 85);
//		System.out.println(lee.profile());
//		System.out.println(lee.Avrg());
		
		//해당 프로그램을 작성합니다.
		// ============성적관리 프로그램============
		// 1. 성적입력
		// 2. 모든학생 성적확인
		// 3. 학생성적검색
		// 9. 종료
		// 메뉴를 입력하세요 : 
		// -> 1번 입력시 이름 수학점수/국어점수/영어점수를 입력받아 객체배열에 저장(중복은 안 됨)
		// -> 2번 입력시 객체배열에 저장된 모든 객체정보 표시
		// -> 3번 입력시 이름을 입력받아 해당 이름의 학생 검색 후 정보 출력
		// -> 9번 입력시 종료
		
		StudentManagement stm = new StudentManagement();
		stm.startProgram();
		
		/*
		int index = 0, menu = 0;
		
		Student[] Starr = new Student[100];
		
		while(menu != 9) {
			System.out.println("============성적관리 프로그램============");
			System.out.println("1. 성적입력");
			System.out.println("2. 모든학생 성적확인");
			System.out.println("3. 학생성적검색");
			System.out.println("9. 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: {
				System.out.println("============성적입력============");
				String name;
				int mathP, korP, engP;
				
				System.out.print("이름 : ");
				name = sc.next();
				
				System.out.print("수학점수 : ");
				mathP = sc.nextInt();
				
				System.out.print("국어점수 : ");
				korP = sc.nextInt();
				
				System.out.print("영어점수 : ");
				engP = sc.nextInt();
				
				int i = 0;
				boolean isTrue = false;
				while(Starr[i] !=null) {
					if (Starr[i++].getName().equals(name)) {
						System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
						isTrue = true;
						break;
					}
				}
				if (!isTrue) {
					Starr[index] = new Student(name, mathP, korP, engP);
					System.out.println("성적 입력 완료 : " + Starr[index++].profile());
				}
			}break;
			case 2: {
				System.out.println("============모든학생 성적확인============");
				for (int i = 0; Starr[i] != null; i++) {
					System.out.println(Starr[i].profile());
				}
				
			}break;
			case 3: {
				System.out.println("============학생성적검색============");
				System.out.print("검색할 학생 : ");
				String name = sc.next();
				Student target = null;
				
				for (int i = 0; Starr[i] != null; i++) {
					if(Starr[i].getName().equals(name)) {
						target = Starr[i];
						System.out.println("검색된 학생 정보 : " + target.profile());
					}else {
						System.out.println("해당하는 이름의 학생이 없습니다.");
					}
				}
			}break;
			case 9: {
				System.out.println("프로그램을 종료합니다.");
			}break;
			default :
			}
		}
		*/
	}
}