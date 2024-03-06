package com.kh.inherit02;

public class Desktop extends Product {
	private boolean allinOne; //일체형
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allinOne) {
		super(brand, pCode, pName, price);
		this.allinOne = allinOne;
	}
	
	public String information() {
		return super.information() + ", allinOne : " + allinOne;
	}
}
