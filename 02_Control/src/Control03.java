import java.util.Scanner;
public class Control03 {
	public static void main(String[] args) {
		// 아이디, 비밀번호를 입력받아 지정해둔 아이디, 비밀번호와 비교해서
		// 전부 일치하면 로그인 성공
		// 아이디가 틀렸을 시 "아이디가 틀렸습니다"
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다"를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
		
		System.out.print("아이디 : ");
		String etid = sc.next();
				
		System.out.print("비밀번호 : ");
		String etpwd = sc.next();
		
//		if (id.equals(etid)) {
//			if (pwd.equals(etpwd)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다");	
//			}
//		} else {
//			System.out.println("아이디가 틀렸습니다");			
//		}
		
		switch(etid) {
		case "myId" :
			switch(etpwd) {
			case "myPassword12" :
				System.out.println("로그인 성공");break;
			default:
				System.out.println("비밀번호가 틀렸습니다");break;
			} break;
		default:
			System.out.println("아이디가 틀렸습니다");
			
		}
	}
}