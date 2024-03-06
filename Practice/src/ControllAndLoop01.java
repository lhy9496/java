import java.util.Scanner;

public class ControllAndLoop01 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력받고 문자열의 검색될 문자를 입력받아 해당 문자가 몇 개 있는지 개수를 출력하세요.
		 * 그리고 다시 하겠습니까? 를 표시해주고 y를 입력하면 다시 반복, 다른 문자라면 종료
		 * 
		 * 문자열 : banana
		 * 문자 : a
		 * banana에 포함된 a의 개수 : 3
		 * 다시 하겠습니까? (y/n) : y
		 */
		Scanner sc = new Scanner(System.in);
		
		String word;
		char spell, retry;
		
		do {
			int count = 0;
			System.out.print("문자열 : ");
			word = sc.next();
			
			System.out.print("문자 : ");
			spell = sc.next().charAt(0);
			
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == spell) {
					count += 1;
				}
			}
			
			System.out.print(word + "에 포함된 " + spell + "의 개수 : " + count + "\n");
			
			System.out.print("다시 하겠습니까? (y/n) : ");
			retry = sc.next().charAt(0);
		}while (retry == 'y');
		
		System.out.println("종료합니다.");
	}
}
