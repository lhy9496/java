import java.util.Scanner;
public class Practice3 {
	/*
	 * 키보드로 가로 세로 값을 실수형으로 입력받아 사각형의 면적과 둘례를 계산하여 출력
	 * 공식)	면적 : 가로 * 세로
	 * 		둘레 : (가로 + 세로) * 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float garo, sero;

		System.out.print("가로 : ");
		garo = sc.nextFloat();
		sc.nextLine();
		
		System.out.printf("세로 : "); 
		sero = sc.nextFloat();
		sc.nextLine();
		
//		System.out.println("면적 : " + (garo*sero));
//		System.out.println("둘레 : " + (2*(garo+sero)));
		System.out.printf("면적 : %.2f \n", (garo*sero));
		System.out.printf("둘레 : %.2f", (2*(garo+sero)));
	}
}
