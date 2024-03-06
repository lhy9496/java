import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자가 입력되면 1~숫자를 하나씩 출력
		// 1 미만의 숫자가 입력되면 "1 이상의 숫자를 입력해주세요"와 함께 다시 입력
//		int i = 0;
//		
//		System.out.print("1 이상의 숫자를 입력하세요 : ");
//		i = sc.nextInt();
//		
//		while (i < 1) {
//				System.out.print("1 이상의 숫자를 입력해주세요 : ");
//				i = sc.nextInt();	
//		}
//		for (int j = 1; j <= i; j++) {
//			System.out.print(j + " ");
//		}
		
		int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(h+":"+m);
	}
}
