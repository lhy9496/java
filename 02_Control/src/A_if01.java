import java.util.Scanner;
public class A_if01 {
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행
	 * 단, 이 순차적인 흐름은 제어문으로 직접 제어가 가능하다.
	 * 
	 * 선택적으로 실행시키고자 한다면 '조건문'
	 * 반복적으로 실행시키고자 한다면 '반복문'
	 * 그 외에 흐름 제어는 '분기문'
	 * 
	 * 조건문
	 * 조건식을 통해 참 또는 거짓을 판단해 참인 경우에만 그에 해당하는 코드를 실행
	 * 
	 * 조건식의 결과는 true/false여야 한다.
	 * 보통 조건식에서는 비교연산자(대조, 동등), 논리연산자(&&, ||)를 주로 사용한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *  * if문 단독 사용
		 *  
		 *  if(조건식) {
		 *  	...실행문
		 *  }
		 *  
		 *  → 조건식이 true일 경우 → 중괄호 블럭 안의 코드를 실행
		 *  → 조건식이 false일 경우 → 중괄호 블럭 안의 코드를 무시하고 넘어감
		 *  
		 */

//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num>0) {
//			System.out.println("양수이다.");
//		}
//		
//		if (num<0) {
//			System.out.println("음수이다.");
//		}

		/*
		 *  *if - else 문
		 *  
		 *  if(조건식) {
		 *  	...실행문 1
		 *  } else {
		 *  	...실행문 2
		 *  }
		 *  
		 *  
		 *  조건식의 결과가 참(true)일 경우, 실행문 1 수행 후 else 구간 스킵
		 *  단, 결과가 거짓(false)일 경우, 무조건 실행문 2 수행
		 */

//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num>0) {
//			System.out.println("양수이다.");
//		} else {
//			if (num<0) {
//				System.out.println("음수이다.");
//			} else {
//				System.out.println("0이다.");
//		}
		/*
		 *  if-else if문
		 *  
		 *  같은 비교대상으로 여러개의 조건을 제시해야 될 경우, 
		 *  
		 *  if(조건식1) {
		 *  	...실행문1
		 *  } else if(조건식2) {
		 *  	...실행문2
		 *  } else if(조건식3) {
		 *  	...실행문3
		 *  } else {
		 *  	위의 조건들이 모두 false일 경우 실행할 코드
		 *  }
		 */
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num>0) {
			System.out.println("양수이다.");
		} else if (num<0) {
			System.out.println("음수이다.");
		} else {
			System.out.println("0이다.");
		}
		
		
		
		
		
		
		
	}
}
