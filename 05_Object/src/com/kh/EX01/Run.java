package com.kh.EX01;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//두 개의 인스턴스 객체 생성
		BankAccount choi = new BankAccount();
		BankAccount kim = new BankAccount();
		sc.next();
		
		//각각의 인스턴스 객체를 대상으로 예금을 진행
		choi.deposit(3000);
		kim.deposit(5000);
		
		//각각의 인스턴스 객체를 대상으로 출금 진행
		choi.withdraw(2000);
		kim.withdraw(2000);
		
		//각각의 인스턴스 객체의 잔액 조회
		choi.checkMyBalance();
		kim.checkMyBalance();
		
		System.out.println(kim.balanceEquals(choi));
		
		choi.checkMyBalance();
		
		
		String st = new String("hello by");
		BankAccount t = new BankAccount();
		t.test(st);
		System.out.println(st.hashCode());
		System.out.println(st);
		
		
		BankAccount lee = new BankAccount();
		lee.initAccount("12-456-78", "123456-789456", 10000);
		
		BankAccount park = new BankAccount();
		park.initAccount("12-446-78", "122256-789456", 10000);
	}
}
