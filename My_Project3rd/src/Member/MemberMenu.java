package Member;

import java.util.Scanner;

import Movie.MovieMenu;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mbc = new MemberController();
	public void MemberMainMenu() {
		/*
		 * 1. 회원가입 signupMember() DB에 회원 등록
		 * 2. 로그인 loginMember() 로그인하면 MovieMainMenu()로 이동
		 * 3. 회원 조회 listMember() 전부 조회? 검색 키워드를 입력?
		 * 4. 회원 탈퇴 dropMember() 탈퇴하면 해당 회원이 예약했던 영화는 전부 예약 취소
		 * 9. 프로그램 종료()
		 */
		
		
	}
	
	public void signupMember() {}
	
	public void loginMember() {
		
		new MovieMenu().MovieMainMenu();
	}
	
	public void listMember() {}
	
	public void dropMember() {}
	
	public void displaySuccessMember() {}
	
	public void displayFailMember() {}
	
	public void displayNoDataMember() {}
	
	public void displayMemberList() {}
}
