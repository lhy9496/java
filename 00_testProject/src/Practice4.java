import java.util.Scanner;

/*
 * 영어 문자열 값을 키보드로 입력받아 문자에서 앞으로부터 3개를 출력
 */

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		System.out.print("문자열을 입력하세요 : ");
		word = sc.next();
		
		System.out.println("첫 번째 문자 : " + word.charAt(0));
		System.out.println("두 번째 문자 : " + word.charAt(1));
		System.out.println("세 번째 문자 : " + word.charAt(2));
	}
}
