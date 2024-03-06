import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2개의 숫자기 입력되면 둘 사이의 숫자를 출력
		// 1 미만의 숫자가 되면 "1 이상의 숫자를 입력해주세요" 출력 후 다시 입력
		int num1, num2;
		
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		while (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			System.out.print("첫번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			num2 = sc.nextInt();
		}
		
		int min = (num1 < num2 ? num1 : num2);
		int max = (num1 < num2 ? num2 : num1);
			for (int i = min+1; i < max; i++) {
				System.out.print(i + " ");
		
		}
		
	}
}
