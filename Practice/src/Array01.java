import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 입력받은 양의 정수만큼 배열의 크기 할당
		//1~입력값까지 배열에 초기화한 후 출력
		
		System.out.print("양의 정수 입력 : ");
		int num = sc.nextInt();
		
		while (num <= 0) {
			System.out.print("다시 입력 : ");
			num = sc.nextInt();
		}
		
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = (i + 1);
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(i + " ");
		}
	}
}
