import java.util.Scanner;
import java.lang.Math;
public class Test240117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 정수형 변수 num1, num2를 입력받아
		// 큰 값에서 작은 값을 뺀 결과를 출력
		
		int num1, num2;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		if( num1 == num2) {
			System.out.println(0);
		} else if (num1 > num2) {
			System.out.println(num1 - num2);
		} else {
			System.out.println(num2 - num1);
		}
		
		// 85에서 10까지 수를 1씩 줄여가며 모든 사이에 숫자를 출력
		
//		for (int i = 85; i >= 10; i--) {
//			System.out.print(i + " ");
//		}
		
		// 임의의 숫자 하나(1~5)를 생성하고 이를 맞추는 프로그램 작성
		// 몇번 만에 맞췄는지 출력하기
		//ex)
		// 컴퓨터가 생각하는 수는 : 4(사용자 입력)
		// 컴퓨터가 생각하는 수는 : 2(사용자 입력)
		// 정답입니다 2번만에 맞추셨습니다.
		
//		int quest, com, take=0;
//		quest = (int)(Math.random() * 5 + 1);
//		
//		do {
//			System.out.print("컴퓨터가 생각하는 수는 : ");
//			com = sc.nextInt();
//			take += 1;
//		} while(quest != com);
//		
//		System.out.printf("정답입니다 %d번만에 맞추셨습니다.", take);
		
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//순서대로 대입하고 그 값을 출력하기
		
//		int[] arr = new int[10];
//		for (int i = 0; i < 10; i++) {
//			arr[i] = i+1;
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.print(arr[i] + " ");
//		};
		
		// 로또 추첨 번호를 예상하는 프로그램 작성
		// 임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호 구하기
		// 중복된 숫자는 있으면 안 됨
		// 길이가 6인 배열 만들고
		// 반복문을 통해 6개의 난수를 각각의 배열의 인덱스값에 대입
		// 생성한 난수가 이미 배열에 존재하는 값일 경우
		// 다시 생성해서 대입
		
//		int[] loto = new int[6];
//		
//		for (int i = 0; i < loto.length; i++) {
//			loto[i] = (int)(Math.random() * 45 + 1);
//			
//			if (i > 0) {
//				for(int j = 0; j < i; j++) {
//					if (loto[i] == loto[j]) {
//						i--; // 중복이 존재하니 i값을 1 줄여서 다시 loto[i]의 값을 넣어준다.
//						break;
//					}
//				}
//			}
//		}
//		System.out.printf("%d %d %d %d %d %d", loto[0], loto[1], loto[2], loto[3], loto[4], loto[5]);
	}
}
