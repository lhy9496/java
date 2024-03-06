import java.util.Scanner;
import java.lang.Math;
public class ControllAndLoop02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String player, user, com;
		String[] arr = {"가위", "바위", "보"};
		int game = 0, win = 0, lose = 0, draw = 0;
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		player = sc.next();
		
		while(true) {
			System.out.print("가위바위보 : ");
			user = sc.next();
			while (!user.equals("가위") && !user.equals("바위") && !user.equals("보") && !user.equals("exit")) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.print("가위바위보 : ");
				user = sc.next();
			}
			
			if (user.equals("exit")) {
				break;
			}
			
			com = arr[(int)(Math.random() * 3)];
			
			System.out.println(player + " : " + user);
			System.out.println("컴퓨터 : " + com);
			
			if (user.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else if ((user.equals("가위") && com.equals("보")) ||
					(user.equals("바위") && com.equals("가위")) ||
					(user.equals("보") && com.equals("바위"))) {
				System.out.println("이겼습니다.");
				win++;
			} else {
				System.out.println("졌습니다.");
				lose++;
			}
			game++;
		}
		System.out.printf("%d전 %d승 %d무 %d패", game, win, draw, lose);
	}
}
