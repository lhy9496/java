package com.kh.inherit02;

public class SmartPhone extends Product {
	private String moblieAgency; //통신사
	
	public SmartPhone(String brand, String pCode, String pName, int price, String moblieAgency) {
		super(brand, pCode, pName, price);
		this.moblieAgency = moblieAgency;
	}
	
	public String information() {
		return super.information() + ", moblieAgency : " + moblieAgency;
	}
}
