import java.util.Scanner;

public class Control04 {
	public static void main(String[] arge) {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한 출력
		 * 관리자: 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 * 회원: 게시글 작성, 게시글 조회, 댓글 작성
		 * 비회원: 게시글 조회
		 */
		Scanner sc = new Scanner(System.in);
		String mem, str = "";

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		mem = sc.next();
		
//		if (mem == "관리자") {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (mem == "회원") {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if (mem == "비회원") {
//			System.out.println("게시글 조회");
//		} else {
//			System.out.println("권한이 올바르지 않습니다.");
//		}
		
//		switch(mem) {
//		case "관리자":
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");break;
//		case "회원" :
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");break;
//		case "비회원" :
//			System.out.println("게시글 조회");break;
//		default :
//			System.out.println("권한이 올바르지 않습니다.");
//		}
		
		switch(mem) {
		case "관리자":
			str += "회원관리, 게시글 관리";
		case "회원" :
			str += (str.equals("")? "" : ", ") + "게시글 작성, 댓글 작성";
		case "비회원" :
			str +=(str.equals("")? "" : ", ") + "게시글 조회";
			System.out.println(str);break;
		default :
			System.out.println("권한이 올바르지 않습니다.");
		}
	}
}
