import java.util.Scanner;
public class Casting02 {
	public static void main(String[] args) {
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균 출력하기
		//총점과 평균은 정수형으로 처리.
	Scanner sc = new Scanner(System.in);
		

		System.out.print("국어: ");
		float kor = sc.nextFloat();
		
		System.out.print("수학: ");
		float mat = sc.nextFloat();
		
		System.out.print("영어: ");
		float eng = sc.nextFloat();

		System.out.println("총점 : "+(int)(kor+mat+eng));
		System.out.println("평균 : "+(int)(kor+mat+eng)/3);
	}
	
}
