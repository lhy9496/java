package com.kh.EX01;

public class BankAccount {
	//필드(클래스의 데이터를 정의하는 곳)
	int balance = 0; // 잔액
	String accNumber; // 계좌번호
	String ssNumber; // 주민등록번호
	
	// 생성자(데이터 초기화를 위한 특수목적 메소드)
	// 생성자는 class와 이름이 동일한 메소드이다.
	// 반환형은 존재하지 않는다.
	// 아무 것도 만들지 않으면 컴파일러가 자동으로 기본생성자를 만들어준다.
	// (뭐 하나라도 만든 생성자와 기본생성자는 엄연히 다르다)
	
	
	public BankAccount() {
		
	}
	
	
	public BankAccount(String accNumber, String ssNumber, int balance) {
		System.out.println("객체 생성");
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
		/*
		 * this. => 객체 자체의 필드값에 접근하는 방법
		 */
	}
	
	public BankAccount(String accNumber, String ssNumber) {
		this(accNumber, ssNumber, 0);
		/*
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = 0;
		*/
	}
	
	//데이터 초기값 세팅을 위한 메소드 생성
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) { //입금
		balance += amount;
		return balance;
	}	
	
	public int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() { //잔액 조회
		System.out.println("잔액 : " + balance);
		return balance;
	}
	public boolean balanceEquals(BankAccount act01) {
		if(balance == act01.balance) {
			return true;
		} else {
			return false;
		}

	}
	
	public void test(String st1) {
		st1.replace("hello", "by");
		
		System.out.println(st1.hashCode());
		System.out.println(st1);
	}
}
