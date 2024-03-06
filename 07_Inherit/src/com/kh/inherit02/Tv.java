package com.kh.inherit02;

public class Tv extends Product {
	private int inch; //크기
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	//Product 쪽의 메소드 + Tv 고유의 메소드
	
	public String information() {
		return super.information() + ", inch : " + inch;
	}
}
