package com.kh.polymorphism01;

class Cake {
	public void yummy() {
		System.out.println("yummy Cake");
	}
}	
class CheeseCake extends Cake {
	public void yummy() {
		super.yummy();
		System.out.println("yummy CheeseCake");
	}
}

class StrawberryCheeseCake extends CheeseCake{
	public void yummy() {
		super.yummy();
		System.out.println("yummy StrawberryCheeseCake");
	}
}
