package practice;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
			if (mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				this.insertMember();
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertMember() {
		if (mc.existMemberNum() == 10) {
			System.out.println("회원 수가 모두 꽉 찼습니다.");
			return;
		}
		System.out.println("새 회원을 등록합니다.");
		String id, name, password, email;
		char gender;
		int age;
		
		while(true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if(mc.existMemberNum() != 0) {
				Boolean chkid = mc.checkId(id);
				if (chkid == true) { 
					System.out.println("중복된 아이디입니다. 다시 입력해주세요");
				} else {
					break;
				}
			} else {
				break;
			}
		}
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("비밀번호 : ");
		password = sc.next();
		
		System.out.print("이메일 : ");
		email = sc.next();
		
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().toUpperCase().charAt(0);
			if (gender != 'M' && gender != 'F') {
				System.out.println("성별을 다시 입력하세요.");
			} else {
				break;
			}
		}
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {	
		System.out.println("1. 아이디로 검색하기"); 
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		String sid = mc.searchId(id);
		if (sid == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			System.out.println(sid);
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member[] sname = mc.searchName(name);
		if (sname[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			for (int i = 0; sname[i] != null; i++) {
				System.out.println(sname[i]);

			}
		}
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		Member[] semail = mc.searchEmail(email);
		if (semail[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 검색 결과입니다.");
			for (int i = 0; semail[i] != null; i++) {
				System.out.println(semail[i]);

			}
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기"); 
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1:
			this.updatePassword();
			break;
		case 2:
			this.updateName();
			break;
		case 3:
			this.updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : "); 
		String id = sc.next();
		
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		
		Boolean upass = mc.updatePassword(id, password);
		if (upass == false) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : "); 
		String id = sc.next();
		
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		Boolean uname = mc.updatePassword(id, name);
		if (uname == false) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : "); 
		String id = sc.next();
		
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		Boolean uemail = mc.updatePassword(id, email);
		if (uemail == false) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 비밀번호 수정하기"); 
		System.out.println("2. 이름 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1:
			this.deleteOne();
			break;
		case 2:
			this.deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char rusure = sc.next().toLowerCase().charAt(0);
		if (rusure == 'y') {
			Boolean delone = mc.delete(id);
			if (delone = true) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char rusure = sc.next().toLowerCase().charAt(0);
		if (rusure == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}
	
	public void printAll() {
		Member[] pa = mc.printAll();
		if (pa[0] == null) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for (Member mem : pa) {
			if (mem == null) {
				continue;
			} else {
				System.out.println(mem.inform());				
			}
		}
	}
}
