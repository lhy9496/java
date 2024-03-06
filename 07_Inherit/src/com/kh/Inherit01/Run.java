package com.kh.Inherit01;

public class Run {

	public static void main(String[] args) {
		Man man = new Man("kh");
		BusinessMan Bman = new BusinessMan("kh", "강사", "지원");
//		man.name = "지원";
//		man.tellYourName();
		
		
		man.Info();
//		man.company = "kh";
//		man.position = "강사";
		Bman.Info();
	}
}
