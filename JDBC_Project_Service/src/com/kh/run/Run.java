package com.kh.run;

import com.kh.view.MemberMenu;

public class Run {

	public static void main(String[] args) {
		/*
		 * M(Model) : 데이터 처리담당
		 * -데이터를 담기 위한 클래스(VO)
		 * -데이터들이 보관된 공간(db)와 직접적으로 접근해 데이터를 주고받는 클래스(DAO))
		 * 
		 * V(View) : 화면을 담당
		 * -사용자가 보게 되는 시각적인 요소
		 * -출력 및 입력
		 * 
		 * C(Controller) : 사용자의 요청을 처리해주는 역할
		 * -
		 * -
		 * 
		 */
		new MemberMenu().mainMenu();
	}
}
