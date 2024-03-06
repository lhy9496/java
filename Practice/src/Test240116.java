import java.util.Scanner;
import java.lang.Math;
public class Test240116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수형 변수 num1, num2를 사용자로부터 입력받아
		//+ - * / % 의 결과값을 각각 출력하세요.

//		int num1, num2;
//		
//		System.out.print("첫번째 정수 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수 : ");
//		num2 = sc.nextInt();
//		
//		System.out.println("+ : " + (num1 + num2));
//		System.out.println("- : " + (num1 - num2));
//		System.out.println("* : " + (num1 * num2));
//		System.out.println("/ : " + (num1 / num2));
//		System.out.println("% : " + (num1 % num2));
		
		//가위바위보를 진행합니다 user1, user2의 가위, 바위, 보 정보를 입력받아
		//누가 이겼는지 출력하세요. 가위바위보 정보는 숫자로 입력받습니다.
		//가위 = 1, 바위 = 2, 보 = 3
		
//		int user1, user2;
//		
//		System.out.print("user1 입력(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user1 = sc.nextInt();
//		while (user1 > 3 || user1 < 1) {
//			System.out.print("다시 입력 : ");
//			user1 = sc.nextInt();
//		}
//		
//		
//		System.out.print("user2 입력(가위 = 1, 바위 = 2, 보 = 3) : ");
//		user2 = sc.nextInt();
//		while (user2 > 3 || user2 < 1) {
//			System.out.print("다시 입력 : ");
//			user2 = sc.nextInt();
//		}
//		
//		
//		switch(user1) {
//		case 1:
//			if (user2 == 1) {
//				System.out.println("무승부");
//			} else if (user2 == 2) {
//				System.out.println("user2의 승리");
//			} else if (user2 == 3) {
//				System.out.println("user1의 승리");
//			} break;
//		case 2:
//			if (user2 == 1) {
//				System.out.println("user1의 승리");
//			} else if (user2 == 2) {
//				System.out.println("무승부");
//			} else if (user2 == 3) {
//				System.out.println("user2의 승리");
//			} break;
//		case 3:
//			if (user2 == 1) {
//				System.out.println("user2의 승리");
//			} else if (user2 == 2) {
//				System.out.println("user1의 승리");
//			} else if (user2 == 3) {
//				System.out.println("무승부");
//			} break;
//		default:
//		}
		
		// 15 ~ 111까지의 수를 순서대로 출력하세요.
		
//		for(int i = 15; i <= 111; i++) {
//		System.out.print(i + " ");
//		}
		
		// 숫자를 입력받아 * 2인 숫자를 출력하세요.
				// 유저가 숫자 0을 입력할 때까지 반복하세요.
				
//		int num;
//				
//		do {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//					
//			System.out.printf("%d * 2 = %d", num, (num*2));
//			System.out.println();
//					
//		}while(num != 0);
		
		//user3의 가위바위보 정보를 입력받고
		//컴퓨터의 랜덤한 가위바위보 정보를 생성해
		//누가 이겼는지 출력하세요.
		//가위바위보 정보는 숫자로 입력받습니다.
		//해당 행위를 user3이 5를 입력받을 때까지 반복하세요.
		
		int cp1 = (int)(Math.random()*3 + 1);
		
		System.out.println();
		while(true) {
			System.out.print("user3 입력(가위 = 1, 바위 = 2, 보 = 3) : ");
			int user3 = sc.nextInt();

			while (user3 != 5 && (user3 > 3 || user3 < 1)) {
				System.out.print("다시 입력 : ");
				user3 = sc.nextInt();
				}
			if(user3 == 5) {
				System.out.println("종료");
				break;
			}
			
			switch(user3) {
			case 1:
				if (cp1 == 1) {
					System.out.println("무승부");
				}else if (cp1 == 2) {
					System.out.println("cp1의 승리");
				} else if (cp1 == 3) {
					System.out.println("user3의 승리");
				} continue;
			case 2:
				if (cp1 == 1) {
					System.out.println("user3의 승리");
				}else if (cp1 == 2) {
					System.out.println("무승부");
				} else if (cp1 == 3) {
					System.out.println("cp1의 승리");
				} continue;
			case 3:
				if (cp1 == 1) {
					System.out.println("cp1의 승리");
				}else if (cp1 == 2) {
					System.out.println("user3의 승리");
				} else if (cp1 == 3) {
					System.out.println("무승부");
				} continue;
			default:
				continue;
			}
		}
		
	}
}
