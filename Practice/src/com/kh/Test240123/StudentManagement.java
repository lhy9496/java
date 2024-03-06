package com.kh.Test240123;

import java.util.Scanner;

public class StudentManagement { // 학생 관리 프로그램
	Scanner sc; //
	Student[] Starr; // 학생 목록
	
	public StudentManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.Starr = new Student[100];
	}
	
	public int printMenu() {
		System.out.println("============성적관리 프로그램============");
		System.out.println("1. 성적입력");
		System.out.println("2. 모든학생 성적확인");
		System.out.println("3. 학생성적검색");
		System.out.println("4. 조건검색");
		System.out.println("5. 마지막 저장 정보 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴를 입력하세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		return menu;
	}
	
	public void startProgram() {
		int menu = 0;
		while(menu !=9) {
			menu = this.printMenu();
			
			switch(menu) {
			case 1:
				this.insertGrade();
				break;
			case 2:
				this.showGrade();
				break;
			case 3:
				this.searchGradeByName();
				break;
			case 4:
				this.searchGradeByCondition();
				break;
			case 5:
				this.lastGradeDelete();
				break;
			case 9:
				this.taskEnd();
				break;
			}
		}
	}
	
	public void insertGrade() {
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
		boolean isTrue = false;// 중복이 존재한다면 true, 아니면 false로 유지
		while(Starr[i] !=null) {
			if (Starr[i++].getName().equals(name)) { // 배열에 저장된 객체의 이름과 입력받은 이름이 동일할 때
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				isTrue = true;
				break;
			}
		}
		if (!isTrue) {
			Starr[i] = new Student(name, mathP, korP, engP);
			System.out.println("성적 입력 완료 : " + Starr[i++].profile());
		}
	}
	
	public void showGrade() {
		System.out.println("============모든학생 성적확인============");
		for (int i = 0; Starr[i] != null; i++) {
			System.out.println(Starr[i].profile());
		}
	}
	
	public void searchGradeByName() {
		System.out.println("============학생이름검색============");
		System.out.print("검색할 학생 : ");
		String name = sc.next();
		Student target = null;
		
		for (int i = 0; Starr[i] != null; i++) {
			if(Starr[i].getName().equals(name)) {
				target = Starr[i];
				System.out.println("검색된 학생 정보 : " + target.profile());
				break;
			}else {
				System.out.println("해당하는 이름의 학생이 없습니다.");
			}
		}
	}
	
	public void searchGradeByCondition() {
		// 1. 평균 2. 수학 3. 국어 4. 영어
		// (다른 번호 입력하면 잘못 입력하셨습니다 출력 후 성적 관리프로그램으로 귀환)
		// 조회할 조건 입력 : 1
		// 기준 점수(이상) :
		// 기준 점수(이하) :
		
		//50 이상 30 이하의 평균 학생
		// ----------
		System.out.println("============학생성적검색============");
		System.out.println("1. 평균 2. 수학 3. 국어 4. 영어");
		System.out.print("조건 입력 : ");
		int cond = sc.nextInt();
		
		System.out.print("기준 점수(이상) : ");
		int min = sc.nextInt();
		
		System.out.print("기준 점수(이하) : ");
		int max = sc.nextInt();
		
		switch (cond) {
		case 1:
			System.out.printf("==평균 점수가 %d점 이상, %d점 이하인 학생==\n", min, max);
			for (int i = 0; Starr[i] != null; i++) {
				double avg = Starr[i].Avrg();
				if (min <= avg && max >= avg) {
					System.out.println(Starr[i].profile());
				}
			}
			break;
		case 2:
			System.out.printf("==수학 점수가 %d점 이상, %d점 이하인 학생==\n", min, max);
			for (int i = 0; Starr[i] != null; i++) {
				int mat = Starr[i].getMathP();
				if (min <= mat && max >= mat) {
					System.out.println(Starr[i].profile());
				}
			}
			break;
		case 3:
			System.out.printf("==국어 점수가 %d점 이상, %d점 이하인 학생==\n", min, max);
			for (int i = 0; Starr[i] != null; i++) {
				int kor = Starr[i].getKorP();
				if (min <= kor && max >= kor) {
					System.out.println(Starr[i].profile());
				}
			}
			break;
		case 4:
			System.out.printf("==영어 점수가 %d점 이상, %d점 이하인 학생==\n", min, max);
			for (int i = 0; Starr[i] != null; i++) {
				int eng = Starr[i].getEngP();
				if (min <= eng && max >= eng) {
					System.out.println(Starr[i].profile());
				}
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void taskEnd() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void lastGradeDelete() {
		if (Starr[0] == null) {
			System.out.println("삭제할 정보가 없습니다.");
			return;
		}
		for (int i = 0 ; i < Starr.length; i++) {
			if (Starr[i] == null) {
				i--;
				System.out.println(Starr[i].profile());
				System.out.println("해당 정보를 삭제하겠습니다.");
				Starr[i] = null;
				return;
			}
		}
	}
}
