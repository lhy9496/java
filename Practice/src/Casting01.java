import java.util.Scanner;
public class Casting01 {
	public static void main(String[] args) {
		//키보드로 문자 하나를 입력받아 그 문자의 유니코드 출력하기
		// ex)
		// 문자 : A
		// unicode : 65

		// 문자의 유니코드 값은 (int)문자 를 써서 출력할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		char chr = 'a';
		
		System.out.print("문자 : ");
		chr = sc.next().charAt(0);
		
		System.out.println("unicode : "+(chr+0));
	}
}
