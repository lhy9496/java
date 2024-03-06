import java.util.Scanner;
public class Control02 {
	public static void main(String[] args) {
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균 계산
		// 결과에 따라 합격인지 불합격인지 나타내는 프로그램을 작성하기.
		// 합격 조건: 세 과목 점수가 각각 40점 이상, 평균 60점 이상
	Scanner sc = new Scanner(System.in);
		

		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수: ");
		int mat = sc.nextInt();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();

		int total = kor+mat+eng;
		float ave = (float)((kor+mat+eng)/3);
		
		if(kor >= 40 && mat >= 40 && eng >= 40 && ave >= 60) {
			System.out.println("불합격입니다.");
			System.out.println("국어 : "+ kor);
			System.out.println("수학 : "+ mat);
			System.out.println("영어 : "+ eng);
			System.out.println("총점 : "+ total);
			System.out.println("평균 : "+ ave);
			System.out.println("축하합니다, 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}