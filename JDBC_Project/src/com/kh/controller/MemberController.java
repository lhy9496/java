package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.Member;
import com.kh.view.MemberMenu;

//Controller :	View를 통해서 사용자가 요청한 기능에 대해서 처리하는 담당
//				해당 메소드로 전달된 데이터[가공처리후] dao로 전달하며 호출
//				dao로부터 반환받은 결과
public class MemberController {
	/*
	 * 사용자의 추가 요청을 처리해주는 메소드
	 * @param userId ~ hobby : 사용자가 입력했던 정보들이 담겨있는 매개변수
	 */
	public void insertMember(String userId, String userPwd, String userName, String gender, String age, String email,
			String phone, String address, String hobby) {
		
		//view로부터 전달받은 값을 바로 dao쪽으로 전달하는 건 아니고
		// 어딘가(Member객체(vo))에 담아서 전달
		
		//방법1) 기본생성자로 생성 후 각 필드마다 setter를 이용해서 데이터 저장
		//방법2) 매개변수 있는 생성자로 전부 전달해서 생성
		
		Member m = new Member(userId, userPwd, userName, gender,
				Integer.parseInt(age), email, phone, address, hobby);
		
		int result = new MemberDao().insertMember(m);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원이 추가되었습니다.");
		} else {
			new MemberMenu().displayFail("회원추가를 실패하였습니다.");
		}
		
	}
	
	/**
	 * 사용자 모두 조회하는 메소드
	 */
	public void selectList() {
		ArrayList<Member> list = new MemberDao().selectList();
		
		//조회된 결과에 따라서 사용자가 보게 될 응답화면 지정
		if(list.isEmpty()) { //list가 비어있음
			new MemberMenu().displayNoData("회원이 없습니다.");
		} else { //list에 뭐가 들어있음
			new MemberMenu().displayMemberList(list);
		}
	}
	
	public void updateMember(String userId, String userPwd,
			String email, String phone, String address) {
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPwd(userPwd);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		
		int result = new MemberDao().updateMember(m);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("회원 정보가 변경되었습니다.");
		} else {
			new MemberMenu().displayFail("회원 정보 변경에 실패하였습니다.");
		}
	}

	public void deleteMember(String userId) {
		int result = new MemberDao().deleteMember(userId);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("성공적으로 탈퇴하였습니다.");
		} else {
			new MemberMenu().displayFail("탈퇴에 실패하였습니다.");
		}
	}
}
