import java.util.Scanner;

public class re_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요
		 * 
		 * 문자열.charAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
		 * index : 0부터 시작한다.
		 */
		
//		System.out.print("이름 : ");
//		String name = sc.next();
//		
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().charAt(0);
//		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("키 : ");
//		float height = sc.nextFloat();
//		sc.nextLine();
//		
//		System.out.printf("이름은 %s, 성별은 %c, 나이는 %d세, 키는 %.1fcm.", name, gender, age, height);
		
		/*
		 * 키보드로 정수 두개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		 */
		
//		System.out.print("첫번째 정수 : ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("두번째 정수 : ");		
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("두 수의 합 : " + (num1 + num2));
//		System.out.println("두 수의 차 : " + (num1 - num2));
//		System.out.println("두 수의 곱 : " + (num1 * num2));
//		System.out.println("두 수를 나눈 몫 : " + (num1 / num2));
		
		/*
		 * 키보드로 가로 세로 값을 실수형으로 입력받아 사각형의 면적과 둘례를 계산하여 출력
		 * 공식)	면적 : 가로 * 세로
		 * 		둘레 : (가로 + 세로) * 2
		 */
		
//		System.out.print("가로 : ");
//		int garo = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("세로 : ");
//		int sero = sc.nextInt();
//		sc.nextLine();
//
//		System.out.println("면적 : " + (garo * sero));
//		System.out.println("둘레 : " + (garo + sero) * 2);
		
		/*
		 * 영어 문자열 값을 키보드로 입력받아 문자에서 앞으로부터 3개를 출력
		 */
		
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		
		System.out.println("첫번째 문자 : " + word.charAt(0));
		System.out.println("두번째 문자 : " + word.charAt(1));
		System.out.println("세번째 문자 : " + word.charAt(2));
		
	}
	
}
