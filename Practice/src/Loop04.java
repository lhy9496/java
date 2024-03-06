import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String cal;
		int num1 = 0, num2 = 0;
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			cal = sc.next();
			
			if (cal.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
		
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			
			switch(cal) {
				case "+":
					System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
					break;
				case "-":
					System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
					break;
				case "*":
					System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
					break;
				case "/":
					if (num2 == 0) {
						System.out.print("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					}
					System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
					break;
				case "%":
					System.out.printf("%d %% %d = %d", num1, num2, num1 % num2);
					break;
				default:
					System.out.print("없는 연산자입니다. 다시 입력해주세요.");
					break;
			}
			System.out.println();
		}
		
	}
}
