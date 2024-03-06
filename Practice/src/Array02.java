import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		// 길이 5의 String 배열을 선언하고 사과, 귤, 포도, 복숭아, 참외로 초기화
		// 인덱스를 이용해서 귤 출력
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"사과" ,"귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
}
