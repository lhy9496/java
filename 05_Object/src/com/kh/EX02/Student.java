package com.kh.EX02;

// 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 객체를 만들기 위한
// 클래스를 작성
// 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get해줄 수 있도록 작성
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	//필드영역(데이터)
	private String name;
	private int age;
	private int mathScore;
	private int enScore;
	private int koScore;
	
	//생성자 영역
	public Student(String name, int age, int mathScore, int enScore, int koScore, int averg) {
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.enScore = enScore;
		this.koScore = koScore;
	}
	
	//메소드 영역
	//getter / setter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getmathScore() {
		return this.mathScore;
	}
	
	public int getenScore() {
		return this.enScore;
	}
	
	public int getkoScore() {
		return this.koScore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setmathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public void setenScore(int enScore) {
		this.enScore = enScore;
	}
	
	public void setkoScore(int koScore) {
		this.koScore = koScore;
	}
	
	
	public void print() {
		System.out.println(name + ", " + age + "살, 영어 : " + enScore +", 수학 : " + mathScore + " , 국어 : " + 80);
	}
	
	public int averg() {
		return ((this.enScore + this.koScore + this.mathScore)/3);
	}
	
	public void profile() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("영어점수 : " + enScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("국어점수 : " + koScore);
		System.out.println(name + "님의 평균 : " + (float)(enScore + koScore + mathScore)/3);
	}
}
