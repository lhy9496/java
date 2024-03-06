import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스의 값을 초기화
		//배열 전체의 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] nums = new int[length];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			nums[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
			
		}
		System.out.println("\n총합 : " + sum);
	}
}
