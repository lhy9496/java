package com.kh.Test240126;

public class Run {
	public static void main(String[] args) {
		PhoneController phcon = new PhoneController();
		
		String[] results = phcon.method();
		
		for(String result : results) {
			System.out.println(result);
			System.out.println();
		}
	}
}
