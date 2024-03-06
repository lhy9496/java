import java.util.Scanner;
public class Operator05 {
	/*
	 * 논리연산자
	 * 두개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과도 논리값이다.
	 * 
	 * 논리값 && 논리값 : 양쪽의 논리값이 모두 true일 때 결과값이 true
	 * 논리값 || 논리값 : 둘 중 하나라도 논리값이 true일 때 결과값이 true
	 * 
	 * && : 두 개의 조건이 모두 true(AND = ~이고, 그리고, ~이면, ~뿐만아니라)
	 * 
	 * true && true → true
	 * true && false → false
	 * false && true → false
	 * false && false → false
	 * && 연산자를 기준으로 앞의 결과가 false일 경우, 뒤의 조건은 굳이 실행하지 않는다.
	 * 
	 * || : 두 개의 조건 중 하나라도 true(OR = 또는, ~이거나)
	 * 
	 * true || true → true
	 * true || false → true
	 * false || true → true
	 * false || false → false
	 * || 연산자를 기준으로 앞의 결과가 true일 경우, 뒤의 조건은 굳이 실행하지 않는다.
	 */
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		
//		//사용자에게 두 수를 입력받아 해당 숫자가 1~100사이의 값인지 확인
//		System.out.println("정수 하나 입력 : ");
//		int num1 = sc.nextInt();
//		
//		// 1 <= num1 <= 100	→ num1>=1 && num1<=100
//		boolean result = (num1>=1) && (num1<=100);
//		
//		System.out.println("사용자가 입력한 값이 1이상 100이하입니다 : " + result);
		
		/*
		 * && : 양쪽의 연산 결과 중 하나라도 false라면 false
		 */
		
		//사용자에게 알파벳 하나를 입력받아 대소문자를 확인
		//문자 하나 입력 :
		//사용자가 입력한 값이 대문자 입니다 : (true/false)
		
		// 'A'~'Z'는 65~90에 해당
		
//		System.out.println("문자 하나 입력 : ");
//		char ch = sc.next().charAt(0);
//		
//		boolean chresult = (ch >= 65) && (ch <= 90);
//		boolean chresult = (ch >= 'A') && (ch <= 'Z');로도 가능
//		System.out.println("사용자가 입력한 값이 대문자 입니다 : " + chresult);
		
		//사용자에게 성별을 입력받은 후 여자인지 확인(F, f 모두 가능)
		// 성별(M/F) :
		// 사용자가 여자입니까 : (true/false)
		
//		System.out.print("성별(M/F) : ");
//		char gen = sc.next().charAt(0);
//		
//		boolean femres = (gen == 'F') || (gen == 'f');
//		System.out.println("사용자가 여자입니까 : " + femres);
		int num = 10;
		
		boolean result1 = (num < 5) && (++num > 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num : " + num);
		
		int num2 = 10;
		boolean result2 = true || (++num > 0);
		System.out.println("result2 : " + result2);
		System.out.println("||연산 후의 num2 : " + num2);
		
		//앞의 연산에서 결과가 확정되면서 뒤의 연산을 무시, ++num이 실행되지 않는다.
	}
}
