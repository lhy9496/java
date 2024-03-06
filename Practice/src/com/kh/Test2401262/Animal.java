package com.kh.Test2401262;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {} //상속관계, 같은 패키지만 접속 가능
	
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public abstract void speak();
	
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. ";
	}
	
	
	
}
