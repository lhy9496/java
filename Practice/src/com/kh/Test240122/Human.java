package com.kh.Test240122;

public class Human {
	String name;
	int money;
	static int count = 0;
	
	public Human(String name, int money) {
		this.money = money;
		this.name = name;
		this.count++;
	}
	
		public void buy(TV tv) {
			if (tv.getprice() > this.money) {
				System.out.println("예산 초과입니다.");
			} else {
				System.out.println("구매가 가능합니다.");
			}
		}
}
