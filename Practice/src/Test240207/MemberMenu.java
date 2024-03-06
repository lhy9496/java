package Test240207;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu(){
		System.out.println("========== KH 사이트 ==========");

		while(true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println();
			
			System.out.print("메뉴 번호 입력 : ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu(){
		
		while(true) {
			System.out.println("=====***** 회원 메뉴 *****=====");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println();
			
			System.out.print("메뉴 번호 입력 : ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void joinMembership(){
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		Member m = new Member(password, name);
		
		while (mc.joinMembership(id, m) == false) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			
			System.out.print("아이디 : ");
			id = sc.next();
			
			System.out.print("비밀번호 : ");
			password = sc.next();
			
			System.out.print("이름 : ");
			name = sc.next();
		}
		System.out.println("성공적으로 회원가입 완료하였습니다.");
	}
	
	public void logIn(){
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		while (mc.logIn(id, password).equals(null)) {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			
			System.out.print("아이디 : ");
			id = sc.next();
			
			System.out.print("비밀번호 : ");
			password = sc.next();
		}
		System.out.println(mc.logIn(id, password) + "님, 환영합니다!");
		memberMenu();
	}
	
	public void changePassword(){
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("현재 비밀번호 : ");
		String oldPass = sc.next();
		
		System.out.print("새로운 비밀번호 : ");
		String newPass = sc.next();
		
		while (mc.changePassword(id, oldPass, newPass) == false) {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			
			System.out.print("아이디 : ");
			id = sc.next();
			
			System.out.print("현재 비밀번호 : ");
			oldPass = sc.next();
			
			System.out.print("새로운 비밀번호 : ");
			newPass = sc.next();
		}
		
		System.out.println("비밀번호 변경에 성공했습니다.");
	}

	public void changeName(){
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
	
		while (mc.logIn(id, password) == null) {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			
			System.out.print("아이디 : ");
			id = sc.next();
			
			System.out.print("비밀번호 : ");
			password = sc.next();
		}
		
		System.out.println("현재 설정된 이름 : " + mc.logIn(id, password));
		System.out.print("변경할 이름 : ");
		String newName = sc.next();
		
		mc.changeName(id, newName);
		System.out.println("이름 변경에 성공했습니다.");
	}
	
	public void sameName(){
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		if(mc.sameName(name) == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		Iterator nameEntry = mc.sameName(name).entrySet().iterator();
		while(nameEntry.hasNext()) {
			Map.Entry entry = (Map.Entry) nameEntry.next();
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
		
	}
}
