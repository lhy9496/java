package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

// View : 사용자가 보게 될 시각적인 요소(화면) 출력 및 입력
public class MemberMenu {
	
	//Scanner 객체 생성(전역으로 다 입력받을 수 있도록)
	private Scanner sc = new Scanner(System.in);
	
	//MemberController 객체생성(전역에서 바로 요청할 수 있도록)
	private MemberController mc = new MemberController();
	
	/*
	 * 사용자가 보게 될 첫 화면(메인 화면)
	 */
	public void mainMenu() {
		
		while(true) {
			System.out.println("=============회원관리 프로그램=============");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 정보 변경");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 회원 아이디 검색");
			System.out.println("6. 회원 이름으로 키워드 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.inputMember();
				break;
			case 2:
				mc.selectList();
				break;
			case 3:
				//userId
				//패스워드, 이메일, 전화번호, 주소
				this.updateMember();
				break;
			case 4:
//				System.out.print("탈퇴할 회원의 아이디 : ");
//				String userId = sc.nextLine();
				
				//String userId = this.inputMemberId();
				mc.deleteMember(this.inputMemberId());
				break;
			case 5:
				mc.selectByUserId(this.inputMemberId());
				break;
			case 6:
				System.out.print("검색할 키워드를 입력해주세요 : ");
				String keyword = sc.nextLine();
				
				mc.selectByUserName(keyword);
				break;
			case 0:
				System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
	
	public void inputMember() {
		System.out.println("\n=============회원 추가=============");
		// id~취미까지 입력받기
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("성별(M, F) : ");
		String gender  = sc.nextLine().toUpperCase();
		
		System.out.print("나이 : ");
		String age = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("취미 : ");
		String hobby = sc.nextLine();
		
		//회원추가 요청 == Controller 메소드 요청
		mc.insertMember(userId, userPwd, userName, gender, age, email, phone, address, hobby);
		
	}
	
	public void updateMember() {
		System.out.println("\n=============회원 정보 변경=============");
		
		String userId = this.inputMemberId();
		
		System.out.print("변경할 비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("변경할 이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("변경할 전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("변경할 주소 : ");
		String address = sc.nextLine();
		
		mc.updateMember(userId, userPwd, email, phone, address);
	}
	
	public String inputMemberId() {
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		return userId;
	}
	
	// 응답화면
	
	/**
	 * 
	 * 서비스요청 처리 후 성공했을 경우 사용자가 보게될 응답화면
	 * @param message: 객체별 성공메세지
	 */
	public void displaySuccess(String message) {
		System.out.println("\n서비스 요청 성공 : " + message);
	}
	/**
	 * 서비스요청 처리 후 실패했을 경우 사용자가 보게될 응답화면
	 * @param message: 객체별 실패메세지
	 */
	public void displayFail(String message) {
		System.out.println("\n서비스 요청 실패 : " + message);
	}
	
	/**
	 * 조회서비스 요청시 조회 결과가 없을 경우 사용자가 보게될 응답화면
	 * @param list: 조회 결과에 대한 응답 메세지
	 */
	public void displayNoData(String message) {
		System.out.println("\n" + message);
	}
	
	/**
	 * 조회서비스 요청시 조회 결과가 여러 행일 경우 사용자가 보게될 응답화면
	 * @param list: 조회 결과에 대한 응답 메세지
	 */
	public void displayMemberList(ArrayList<Member> list) {
		for(Member m : list) {
			System.out.println(m);
		}
	}
	
	public void displayMember(Member m) {
		System.out.println("\n조회된 데이터는 다음과 같습니다.");
		System.out.println(m.toString());
	}
}
