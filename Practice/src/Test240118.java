import java.util.Scanner;

public class Test240118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실수 num1, num2를 입력받아 +, %, / 3가지 결과를 출력
		
//		float num1, num2;
//		
//		System.out.print("첫번째 실수 : ");
//		num1 = sc.nextFloat();
//		
//		
//		System.out.print("두번째 실수 : ");
//		num2 = sc.nextFloat();
//		
//		System.out.print("+ : ");
//		System.out.printf("%f + %f = %f\n", num1, num2, num1 + num2);
//		
//		
//		System.out.print("% : ");		
//		System.out.printf("%f %% %f = %f\n", num1, num2, num1 % num2);
//		
//		System.out.print("/ : ");
//		System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
		
		// 정수형 변수 num3를 사용자로부터 입력받아 100보다 작으면 100 이하,
		// 100~200 사이면 200 이하, 200~300 사이면 300 이하,
		// 그 이상이라면 300초과를 출력
		
//		System.out.print("정수 입력 : ");
//		int num3 = sc.nextInt();
//		
//		if (num3 <= 100) {
//			System.out.println("100 이하");
//			
//		} else if (num3 > 100 && num3 <= 200) {
//			System.out.println("200 이하");
//			
//		} else if (num3 > 200 && num3 <= 300) {
//			System.out.println("300 이하");
//		
//		} else {
//			System.out.println("300 초과");	
//		}
		
		// 수학 영어 국어 성적을 입력받아 평균 60을 기준으로 합격, 불합격 출력
		
//		int kor, mat, eng;
//		
//		System.out.print("국어 성적 : ");
//		kor = sc.nextInt();
//		
//		System.out.print("수학 성적 : ");
//		mat = sc.nextInt();
//		
//		System.out.print("영어 성적 : ");
//		eng = sc.nextInt();
//		
//		float avr = (float)(kor + mat + eng)/3;
//		
//		System.out.printf("평균 점수 : %.2f\n", avr);
//		
//		if (avr >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		// 국어 성적을 입력받아 50점 이하는 F학점, 50~60은 D, 60~70은 C,
		// 70~80은 B, 80점 초과는 A학점 출력
		
//		System.out.print("국어 성적 : ");
//		int korg = sc.nextInt();
//		
//		if (korg <= 50) {
//			System.out.println("F학점");
//		} else if (korg > 50 && korg <=60) {
//			System.out.println("D학점");
//		} else if (korg > 60 && korg <=70) {
//			System.out.println("C학점");
//		} else if (korg > 70 && korg <=80) {
//			System.out.println("B학점");
//		} else {
//			System.out.println("A학점");
//		}
			
		// 크기가 9인 1차원배열 arr1을 작성하고 구구단 2단을 각 인덱스에 대입, 출력
		// ex) arr1[0] = "2 * 1 = 2";
		
//		int[] arr1 = new int[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = (i + 1) * 2;
//			System.out.printf("2 * %d = %d\n", i + 1, arr1[i]);
//		}

		// 크기가 9인 1차원배열 arr2을 작성하고 구구단 3단을 각 인덱스에 대입, 출력
		// ex) arr2[0] = "3 * 1 = 3";
		
//		int[] arr2 = new int[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[i] = (i + 1) * 3;
//			System.out.printf("3 * %d = %d\n", i + 1, arr2[i]);
//		}
		
		// 크기가 [8][9]인 2차원배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입
		// ex) arr3[0][0] = "2 * 1 = 2";.
		
		String[][] arr3 = new String[8][9];
		for (int i = 0; i < arr3.length; i++) { // 2~9
			for (int j = 0; j < arr3[i].length; j++) { // 1~9
				arr3[i][j] = (i + 2) + " * " + (j + 1) + " = " + (i + 2) * (j + 1);
			}
		}
		
		// 구구단의 한 단을 배열에 저장하는 반복문
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("===== " + (i + 2) + "단 =====");
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
	}	
}
