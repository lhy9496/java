import java.util.Scanner;

public class Loop03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력된 숫자~9단까지의 구구단 출력
		//1 미만, 9 초과인 숫자가 입력되면 다시 입력
		
		int num;
		
		System.out.print("숫자 : ");
		num = sc.nextInt();

		while(num > 9 || num < 1) {
			System.out.println("1 이상, 9 이하의 숫자만 입력해주세요");
			System.out.print("숫자 : ");
			num = sc.nextInt();
		}
		
		for(int i = num; i <= 9 ; i++) {
			System.out.printf("====%d단====", i);
			System.out.println();
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d", i , j, (i*j));
				System.out.println();
			}
		}
	}
}
