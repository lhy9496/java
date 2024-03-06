package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	public String afterToken(String str) {
		StringTokenizer strarr = new StringTokenizer(str , " ");
		int length = strarr.countTokens();
		String aftstr = "";
		for (int i = 0; i < length; i++) {
			aftstr = aftstr.concat(strarr.nextToken());
		}
		return aftstr; 
	}
	
	public String firstCap(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		String input2 = input.toUpperCase();
		String input3 = input.replace(input.charAt(0), input2.charAt(0));
		return input3;
	}
	
	public int findChar(String input, char one) {
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (one == input.charAt(i)) {
				result++;
			}
		}
		return result;
	}
}
