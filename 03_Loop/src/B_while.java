import java.util.Scanner;
import java.lang.Math;
public class B_while {
	/*
	 * while문
	 * 
	 * [초기식;]
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 해당 코드를 실행한다.
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * ......
	 * 조건식 검사 --> false일 경우 실행코드 실행 x => 반복문 탈출
	 * 
	 */
	public static void main(String[] srgs) {

		Scanner sc = new Scanner(System.in);
		
		
		//		for (int i = 0; i < 5; i++) {
//			System.out.println("안녕하세요.");
//		}
//		int i = 0;
//		
//		while(i < 5) {
//			System.out.println("안녕하세요.");
//			i++;
//		}
		
		//1에서부터 10000 사이의 홀수만을 출력
		// 1 3 5 7 9...
		
//		int i = 1;
//		
//		while (i<=10000) {
//			System.out.print(i + " ");
//			i += 2;
//		}
		
		// 1부터 랜덤값(1~100 사이) 까지의 합계를 출력
		// 1에서부터 xx까지의 총 합계 : xxxx
		
//		int random = (int)(Math.random() * 100 + 1);
//		int sum = 0;
//		int i = 1;
		
//		for (; i <= num ; i++) {
//			sum += i;
//		}
		
//		while (i <= random) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("1에서부터 %d까지의 총 합계 : %d", random, sum);
		
		/*
		//사용자에게 문자열을 입력받아
		//해당 문자열의 짝수자리 글자만 출력
		//문자열 입력 : hello
		//el
		 * 
		 * 1. 문자열 입력받기
		 * 2. 입력받은 문자열 반복문으로 하나씩 전부 출력해보기
		 * 3. 짝수자리만 출력하기
		*/
		
		String str; //문자열 생성
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine(); //문자열 입력
		
		int i = 0; //인덱스 지정을 위한 정수 생성
		
		while(i < str.length()) { //조건식: 인덱스 길이만큼 지정
			if (i % 2 == 1) { //인덱스 홀수자리=짝수자리만 선택
				System.out.print(str.charAt(i));//짝수자리 문자열 출력
			}
			i++;
		}
	}
	
}
