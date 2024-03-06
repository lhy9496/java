import java.util.Scanner;

public class Array06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3 이상의 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가
		// 중간 이후부터는 1씩 감소하는 식으로 값을 넣어 출력
		// 입력한 정수가 홀수가 아니거나 3 미만일 경우, "다시 입력하세요"를 출력하고 다시 정수를 입력
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		while (num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			num = sc.nextInt();
		}
		
		int[] nums = new int[num];
		
		for (int i = 0; i <= num / 2; i++) {
			nums[i] = i + 1;
		}
		
		for (int j = (num / 2 + 1); j < num; j++) {
			nums[j] = num - j;
		}
		
		for (int k = 0 ; k < num; k++) {
			System.out.print(nums[k] + " ");
		}
			
	}
}
