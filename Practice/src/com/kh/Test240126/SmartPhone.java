package com.kh.Test240126;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker; // 제조사 정보
	
	public SmartPhone() {
		this.maker = "";
	}
	
	public abstract String printinformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
	
}
