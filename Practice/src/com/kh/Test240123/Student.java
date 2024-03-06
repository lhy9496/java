package com.kh.Test240123;

public class Student {
	private String name;
	private int mathP;
	private int korP;
	private int engP;
	
	public Student(String name, int mathP, int korP, int engP) {
		this.name = name;
		this.mathP = mathP;
		this.korP = korP;
		this.engP = engP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathP() {
		return mathP;
	}

	public void setMathP(int mathP) {
		this.mathP = mathP;
	}

	public int getKorP() {
		return korP;
	}

	public void setKorP(int korP) {
		this.korP = korP;
	}

	public int getEngP() {
		return engP;
	}

	public void setEngP(int engP) {
		this.engP = engP;
	}
	
	public double Avrg() {
		return (this.mathP + this.korP + this.engP)/3;
	}
	
	public String profile(){
		return "[이름: " + name + " 수학성적 : " + mathP + " 국어성적 : " + korP + " 영어성적 : " + engP + "]";
	}
}
