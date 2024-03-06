import java.util.Scanner;

public class Test240119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수형 변수 age를 입력받아 7세 이하라면 어린이, 19세 이하면 청소년, 20세 이상이면 성인 출력
	
		/*
		System.out.print("age : ");
		int age = sc.nextInt();
		
		if (age <= 7) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		*/
		
		//정수 num1, num2 두 개를 입력받아 두 수 수이에 있는 3의 배수의 모든 합을 구하라.
		
		/*
		int num1, num2, min, max, sum = 0;
		
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
		min = num1 > num2? num2 : num1;
		max = num1 > num2? num1 : num2;
			
		for (int i = min; i <= max; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 : "sum);
		*/
		
		//정수 n01, n02 두 개를 입력받아 두 수 수이에 있는 모든 홀수의 합, 짝수의 합을 각각 구해라.
		
		/*
		int n01, n02, min0, max0, sumo = 0, sume = 0;
		
		System.out.print("n01 : ");
		n01 = sc.nextInt();
		
		System.out.print("n02 : ");
		n02 = sc.nextInt();
		
		min0 = n01 > n02? n02 : n01;
		max0 = n01 > n02? n01 : n02;

		for (int i = min0; i <= max0; i++) {
			if (i % 2 != 0) {
				sumo += i;
			} else {
				sume += i;
			}
		}
		System.out.println("정수의 합 : " + sumo);
		System.out.println("짝수의 합 : " + sume);
		*/

		// 첫째 줄에 데이터의 개수 n개를 입력받고
		// 사용자로부터 n개의 정수를 입력받아 그 역순으로 출력하세요.
		//ex) 정수 입력 : 5
		// 숫자 입력 : 1 7 5 9 4
		// 반대로 출력 : 4 9 5 7 1
		
		/*
		System.out.print("정수 입력 : ");
		int datanum = sc.nextInt();
		
		int[] ren = new int[datanum];
		
		for (int i = 0; i < datanum; i++) {
			System.out.print("숫자 입력 : ");
			ren[i] = sc.nextInt();
		}
		for (int j = datanum-1; j>= 0; j--) {
			System.out.print(ren[j] + " ");
		}
		*/
		
		// 행의 크기를 입력받고 그 수만큼의 반복으로 열의 크기도 받아 
		// 문자형의 가변 배열을 선언 및 할당하기
		// 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하기
		
		int row, col;
		System.out.print("행의 크기 : ");
		row = sc.nextInt();
		char[][] arr = new char[row][];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"번째 열의 크기 : ");
			col = sc.nextInt();
			arr[i] = new char[col];
		}
		char word = 'a';
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = word++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
