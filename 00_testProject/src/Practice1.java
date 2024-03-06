import java.util.Scanner;
public class Practice1 {

	/*
	 * 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요
	 * 
	 * 문자열.charAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
	 * index : 0부터 시작한다.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name, gender;
		int age;
		float height;
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		height = scan.nextFloat();
		scan.nextLine();

//		System.out.println("키 " + height + " cm인 나이 "+ age + "살 " + gender + "자 " + name + "님 반갑습니다^^*");
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^*", height, age, gender, name);
	}
}
