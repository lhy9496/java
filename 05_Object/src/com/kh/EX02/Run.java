package com.kh.EX02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//choi 객체 생성 최지원, 15살, 영어 : 60, 수학 : 70, 국어 : 80
		//kim 객체 생성 김도헌, 17살, 영어 : 95, 수학 : 85, 국어 : 80
		/*
		Student choi = new Student("최지원", 15, 70, 60, 80);

		Student kim = new Student("김도헌", 17, 85, 95, 80);
		
		// choi의 모든 과목의 평균을 출력
		choi.avg();
		
		// kim의 모든 과목의 평균을 출력
		kim.avg();
		*/
		// 사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		// 평균을 구하고 출력하는 프로그램 작성
		// ex)	이름	: 최지원
		//		나이	: 15
		//	영어점수	: 80
		//	수학점수	: 100
		//	국어점수	: 75
		// 최지원님의 평균	: 85
		
		Scanner sc = new Scanner(System.in);
		/*
		String name;
		int age, en, math, ko;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("영어점수 : ");
		en = sc.nextInt();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		System.out.print("국어점수 : ");
		ko = sc.nextInt();
		
		Student st1 = new Student(name, age, math, en, ko);
		
		System.out.println(st1.getName() + "님의 평균 : ");
		*/
		
		// kh대학교, avgCut : 75, enCut : 60, koCut : 60으로 객체 생성
		
		University kh = new University("kh대학교", 75, 60, 60);
		Student choi = new Student("최지원", 15, 70, 60, 80, 70);
		
		
		//choi 학생 객체는 kh대학교에 입학이 가능한지 검사하여
		//가능하다면 "합격입니다", 불가능하다면 "불합격입니다"
		//를 출력하는 프로그램 작성
		
		kh.isEvaluate(choi);
		
		
	}
}
