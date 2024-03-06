package com.kh.EX02;

// 이름(name), 평균 합격컷(avgCut), 국어 최저점수(koCut), 영어 최저점수(enCut)
// 모든 데이터를 매개변수로 받아 초기화하는 생성자 정의

public class University {
	private String name;
	private int avgCut;
	private int koCut;
	private int enCut;
	
	public University(String name, int avgCut, int koCut, int enCut) {
		this.name = name;
		this.avgCut = avgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getavgCut() {
		return this.avgCut;
	}
	
	public int getkoCut() {
		return this.koCut;
	}
	
	public int getenCut() {
		return this.enCut;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setavgCut(int avgCut) {
		this.avgCut = avgCut;
	}
	
	public void setenScore(int koCut) {
		this.koCut = koCut;
	}
	
	public void setkoScore(int enCut) {
		this.enCut = enCut;
	}

	//Student 객체의 합격/불합격 여부 출력
	public void isEvaluate(Student st) {
		if (st.getenScore() >= this.getenCut() &&
				st.getkoScore() >= this.getkoCut() &&
				st.averg() >= this.getavgCut()) {
			System.out.println(st.getName() + "님은 합격입니다.");
		} else {
			System.out.println(st.getName() + "님은 불합격입니다.");
		}
	}
	
}
