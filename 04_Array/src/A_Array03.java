import java.lang.Math;
import java.util.Scanner;
public class A_Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// 1.	크기가 10인 정수형 배열 생성
		
		int[] arr = new int[10];
		
		// 2.	반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지
		//		순차적으로 접근하면서 값을 대입
		//		매번 1~100사이의 랜덤값
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3.	반복문을 활용해서 해당 배열의 0번 인덱스~마지막 인덱스까지
		//		담겨있는 값을 전부 출력
		// arr[x] : xx
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("arr[%d] : %d\n", j, arr[j])
			;
		}
		
		
		// 1.	사용자에게 배열의 길이를 입력받은 후
		//		해당 크기의 문자열 배열을 생성
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		String [] Starr = new String[size];
		
		// 2.	반복문을 활용해서 매번 사용자에게 과일명을 입력받아
		//		그 값을 매 인덱스 자리에 대입(0~마지막 인덱스)
		
		for(int i = 0; i < Starr.length; i++) {
			System.out.print("과일 입력 : ");
			Starr[i]= sc.next();
		}
		
		// 3.	반복문을 이용해서 0~마지막 인덱스까지 담긴 값을 출력
		
		for(int i = 0; i < Starr.length; i++) {
			System.out.println(Starr[i]);
		}
		
		
		//사용자에게 문자열 하나 입력받은 후
		//각각의 인덱스에 있는 문자들을 char 배열에 옮겨담기
		
		// 1.	사용자에게 문자열 하나 입력받기
		
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		
		// 2.	char배열 생성해두기(배열의 길이 == 문자열의 길이)
		// 문자열.length()
		
		char[] charr = new char[word.length()];
		
		// 3.	반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열의 각 인덱스에 대입
		// charAt(index)
		
		for (int i = 0; i < word.length(); i++) {
			charr[i] = word.charAt(i);
		}
		
		// 4.	반복문을 이용해서 해당 배열의 0~마지막 인덱스까지 담긴 값을 출력
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print(charr[i]);
		}
		
		
		
		//	1.	사용자에게 배열의 길이를 입력받은 후, 해당 크기 만큼 정수배열 생성
		
		System.out.print("배열 길이 : ");
		int i = sc.nextInt();
		int[] nums = new int[i];
		
		//	2.	반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 대입
		
		for(int j = 0; j < i; j++) {
			nums[j] = (int)(Math.random() * 100 + 1);
		}
		
		//	3.	반복문 활용해서 배열에 담긴 모든 값 출력
		//	4.	그 중 짝수인 값들의 총 합을 구하기
		
		int sum = 0;
				
		for(int j = 0; j < i; j++) {
			System.out.println(nums[j] + " ");
			if (nums[j] % 2 == 0) {
				sum += nums[j];
			}
		}
		
		System.out.printf("짝수 값 총합 : %d", sum);
		*/
		
	}
}
