import java.util.Scanner;
public class A_if02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*나이를 입력받아
		 * 13세 이하 : 어린이
		 * 13세 초과 19세 이하 : 청소년
		 * 19세 초과 : 성인
		 * xx세는 xxx에 속합니다.
		 */
//		int age;
//		String type = "";
//		
//		System.out.print("나이(정수만) : ");
//		age = sc.nextInt();
//		sc.nextLine();
		
//		if(age <= 13) {
//			type = "어린이";
//		}
//		if(age >13 && age <=19) {
//			type = "청소년";
//		}
//		if(age > 19){
//			type = "성인";
//		}

		//if만 사용한 조건문은 그 어떤 조건을 만족시키지 못한 경우를 상정한다.
		//때문에 if 조건문 안에서만 값이 정해지는 변수를 출력할 때 오류가 발생한다.
		//이런 경우에는 변수에 임시 값을 미리 지정해야 한다.
		
//		if(age <= 13) {
//			type = "어린이";
//		} else if(age <=19) {
//			type = "청소년";
//		} else {
//			type = "성인";
//		}
//		
//		//else를 사용한 조건문의 경우, 변수의 값이 반드시 확정된다.
//		
//		System.out.println(age+"세는 "+ type +"에 속합니다.");
		
		
		/*
		 * 성별을 (m/f, 대소문자 무관)로 입력받아 학생의 성별을 출력하는 프로그램
		 * 성별(m/f) :
		 * 여학생입니다 / 남학생입니다 / 잘못 입력하셨습니다
		 */
		
//		char gender = 'a';
//		String result = "";
		
//		System.out.print("성별(m/f) : ");
//		gender = sc.next().charAt(0);
//		
//		if(gender == 'f' || gender == 'F') {
//			result = "여학생입니다.";
//		} else if(gender == 'm' || gender == 'M') {
//			result = "남학생입니다.";
//		} else {
//			result = "잘못 입력하셨습니다.";
//		}
		
//		System.out.println(result);
//		
//		if(gender == 'f' || gender == 'F') {
//			result = "여학생";
//		} else if(gender == 'm' || gender == 'M') {
//			result = "남학생";
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//			return; // 해당 메소드 자체를 빠져나가는 구문
//		}
//		
//		System.out.println(result + "입니다.");
		
		int num = 0;
		String str = "";
		
		System.out.print("정수(양수) 입력 : ");
		num = sc.nextInt();
		sc.nextLine();
		
		if(num<=0) {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
			return;
		} else if(num%2==0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str+"다.");
	}	
}
