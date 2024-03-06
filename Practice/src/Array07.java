import java.util.Scanner;

public class Array07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		
		String[] menu = {"후라이드", "양념", "반반", "간장", "파닭", "뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();
		
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(chicken)) {
				isTrue = true;
				break;
			}	
		}
		if (isTrue) {
			System.out.printf("%s치킨 배달 가능", chicken);
		} else {
			System.out.printf("%s치킨은 없는 메뉴", chicken);
		}
		
	}
}
