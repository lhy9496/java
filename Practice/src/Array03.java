import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇개 들어있는지
		 * 개수와 몇 번째 인덱스에 위치하는 지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] chArr = new char[str.length()];
		
		for(int i = 0; i<str.length();i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.print("검색할 " + "문자 : ");
		char spell = sc.next().charAt(0);
		
		for(int i = 0; i<str.length();i++) {
			if(chArr[i] == spell) { 
				System.out.print(i + " ");
			}
		}
		
	}
}
