import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어주기
		 * 0~6까지의 숫자를 입력받아 해당 인덱스에 있는 정보의 요일 출력
		 * 해당되지 않는 숫자 입력 시 '0~6까지의 숫자를 입력'를 출력하고 다시 입력
		 */
		
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		
		System.out.print("0~6까지의 숫자를 입력 : ");
		int num = sc.nextInt();
		
		while (num > 6 || num < 0) {
			System.out.print("0~6까지의 숫자를 입력 : ");
			num = sc.nextInt();
		}
		
		System.out.printf("%c요일", week[num]);
		
	}
}
