import java.util.Scanner;
import java.lang.Math;

public class A_for {
	
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * 크게 for문, while문(do-while문) 2종류로 나뉨
	 * 
	 *  * for문
	 *  
	 *  for(초기식; 조건식; 증감식){
	 *  	반복적으로 실행시키고자 하는 구문
	 *  }
	 *  
	 *  - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행하는 구문"
	 *  		(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 *  
	 *  - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 *  		조건식이 true일 경우, 해당 구문을 실행
	 *  		조건식이 false가 되는 순간, 반복을 멈추고 빠져나옴
	 *  		(보통 초기식에 제시된 변수를 가지고 조건식을 정함)
	 *  
	 *  - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 *  		(보통 초기식에 제시된 변수를 가지고 증감연산자를 사용함)
	 *  
	 *  * for문을 만나는 순간
	 *  초기식 → 조건식 검사 → true일 경우 실행구문 실행 → 증감식
	 *  		조건식 검사 → true일 경우 실행구문 실행 → 증감식
	 *  		------------ 해당 내용을 반복 -------------
	 *  		조건식 검사 →false일 경우 실행구문 실행 x → 반복문 빠져나옴
	 *  
	 *  tip. 알아둘 점
	 *   for문 안의 초기식, 조건식, 증감식은 각각 생략 가능(;는 반드시 표기)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			"안녕하세요"를 5번 출력하기
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		
//		for(int i = 0; i < 5; i++) { // i의 값이 0에서 4까지 매번 1씩 증가하는 동안 반복수행(0 1 2 3 4)
//			System.out.println("안녕하세요");
//		}
//		
//		for(int i = 11; i < 16; i++) { // i의 값이 11에서 15까지 매번 1씩 증가하는 동안 반복수행(11 12 13 14 15)
//			System.out.println("안녕하세요");
//		}
//		
//		for(int i = 1; i <= 9; i+= 2) { // i의 값이 1에서 9까지 매번 2씩 증가하는 동안 반복수행(1 3 5 7 9)
//			System.out.println("안녕하세요");
//		}
		
		/* 1~5까지 순차적으로 출력(1 2 3 4 5)
		for (int i = 1; i < 6; i++) { // 1 2 3 4 5
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//5~1까지 순차적으로 출력
		
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");	
		}
		
		
		// 정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		// 정수 입력 : 3
		// 1 2 3

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		
		// 1부터 10 사이의 홀수만 출력
		// 1 3 5 7 9
		
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");	
			}
		}
		
		
		// 1에서부터 100까지 총 합계를 구해라
		// 방법 1. 1+2+3...+100
		
		// 방법 2.
		/*
		 * int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 10;
		 * 
		 * 규칙 찾기 : sum 변수에 누적해서 합산하는 것 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가한다.
		 */
		/*
		int sum = 0 ;
		for (int i = 1; i < 11 ; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		*/
		
		// 정수 n을 입력받아 1부터 n까지 1씩 증가하며 모든 수를 더해서 출력하기
		// 정수 입력 : 5
		// 1부터 5까지의 합 : 15
		
//		int i = 1, n, sum = 0 ;
//		
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		
//		for (; i <= n ; i++) {
//			sum += i;
//			}
//		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드
		 * 매번 다른 랜덤값을 얻어낼 수 있다.
		 * 
		 * Math.random() 호출시 → 0.0 ~ 0.99999999 사이의 랜덤값을 반환
		 * 						(0.0 <=		< 1.0)
		 * 
		 * int random = Math.random(); // double 형이라서 불가능
		 * 				(0.0 <=		< 1.0)
		 * 
		 * int random = Math.random() * 10;
		 * 				(0.0 <=		< 10.0) → 0.0 ~ 9.9999999
		 * 
		 * int random = Math.random() * 10 + 1;
		 * 				(1.0 <=		< 11.0) → 1.0 ~ 10.9999999
		 * 
		 * int random = (int)(Math.random() * 10 + 1);
		 * 				1 ~ 10
		 * 
		 * 		int random = (int)(Math.random() * 10 + 1);
		 *	System.out.println(random);
		 * 
		 */
		
		
		// random(1~10)한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요
		// random 수 : 5
		// 1~5까지의 합 : 15
		
		/*
		int n, i=1 , sum = 0;
		
		n = (int)(Math.random() * 10 + 1);
		System.out.println("random 수 : " + n);
		
		for (; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("1~%d까지의 합 : %d", n, sum);
		
		
		// random(5~50)한 숫자 n을 생성해서 1부터 n까지의 숫자 중 짝수만 출력해라
		// random 수 : 10
		// 2 4 6 8
		
		int n, i;
		n = (int)(Math.random() * 45 + 5);
		
		System.out.println("random 수 : " + n);
		for (i = 1 ; i < n ; i++) {
			if (i %2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		String str = "HelloWorld";
		
		
		
		 * 각 인덱스별 문자 뽑아서 출력
		 * 
		 *  H => str.charAt(0) H 출력
		 *  e => str.charAt(1) e 출력
		 *  l => str.charAt(2) l 출력
		 *  l => str.charAt(3) l 출력
		 *  o => str.charAt(4) o 출력
		 *  
		 *  0번 인덱스부터 4번 인덱스(마지막 인덱스)까지 매번 1씩 증가하면서 반복 수행
		 *  
		 *  문자열.length() : 문자열의 길이를 구할 수 있다.
		 
		
		for (int i = 0 ; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		 
		
		//사용자에게 문자열을 입력받아
		//해당 문자열의 짝수자리 글자만 출력
		//문자열 입력 : hello
		//el
		
		String str; // 문자열 변수 str 정의
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine(); // str에 넣을 문자열 입력
		
		for (int i = 0; i < str.length(); i++) { //인덱스를 기준으로 문자열 체크
			if (i %2 != 0) { //출력하려는 건 짝수자리의, 인덱스는 홀수인 글자
				System.out.print(str.charAt(i)); //지정한 인덱스의 문자 출력
			}
		}*/

		
		// 구구단 2단 출력하기
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * 
		 
		
		for(int i = 1; i<10 ; i++) {
			System.out.println("2 * " + i + " = " + i * 2);
		printf 버전은 어떻게?
		}
		*/
		// 사용자로부터 단을 입력받아
		// 사용자가 입력한 단을 출력하기
		// 단 수(2~9)를 입력 : 3
		
//		int i, num;
//		
//		System.out.print("단 수(2~9)를 입력 : ");
//		num= sc.nextInt();
//		
//		if(num >=2 && num <=9) {
//			for(i = 1 ; i < 10 ; i++) {
//				System.out.printf("%d * %d * %d\n", num, i, num * i);
//				}
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
//		int i, j;
//		for (j = 1; j < 4; j++) {
//			for (i = 1; i < 6; i++) {
//				System.out.print(i + " ");
//			}System.out.println("");
//		}
//		
//		System.out.println();
		
		//2단부터 9단까지 모두 출력
		
		int i, j;
		for (j = 2; j < 10; j++) {
			for (i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d", j, i, j*i);
				System.out.println("");
			}System.out.println("");
		}
	}
}
