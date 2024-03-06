package com.kh.Test240122;
import java.lang.Math;
import java.util.Scanner;

public class Run {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		// 정수 n(2~9)를 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 함수 작성
		// 2~9 사이의 값이 아닐 경우, '다시 입력하세요'를 반복
		
		/*
		System.out.print("정수 n(2~9) : ");
		int n = sc.nextInt();
		
		while (n < 2 || n > 9) {
			System.out.print("다시 입력하세요 : ");
			n = sc.nextInt();
		}
		
		for (int i = 2 ; i <= n ; i++) {
			if (i % 2 == 0) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1 ; j <= 9 ; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}
		
		
		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고
		// 1~100 사이의 랜덤값으로 모든 배열의 값을 대입
		// 이후 배열의 홀수 인덱스의 값 총합을 구하기
		
		
		System.out.print("정수 num : ");
		int num = sc.nextInt();
		int[] narr = new int[num];
		
		for (int i = 0; i < narr.length; i++) {
			narr[i] = (int)(Math.random() * 100 + 1);
		}
		int sum = 0;
		
		for (int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + " ");
			if (i % 2 != 0) {
				sum += narr[i];
			}
		}
		System.out.println("총합 : " + sum);
		*/
		
		TV myTV = new TV("삼성", 2020, 65, 100000);
		myTV.show();
		TV myTV2 = new TV("LG", 2024, 85, 200000);
		myTV2.show();
		
		// one이라는 Human 객체 생성
		// 해당 객체로 MyTV, MyTV2의 구매 가능 여부 확인
		
//		Human one = new Human("이씨", 150000);
//		one.buy(myTV2);
//		one.buy(myTV);
		
		Human choi = new Human("최지원", 15000);
		System.out.println(choi.count);
		
		Human kim = new Human("김지원", 15000);
		System.out.println(choi.count);
	}
}