package com.kh.employy;

import java.util.Scanner;

/*
 * 화면에 출력하는 것과
 * 사용자로부터 입력받는 것을 처리해주는 객체
 */
public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	//메인화면을 출력하는 메소드
	public void EmployeeMainMenu() {
		/*
		 * 1. 사원추가
		 * 9. 프로그램 종료
		 * 메뉴 번호를 누르세요 : 
		 * (정수하나입력받기)
		 */
		int number;
		
		while(true) {
			System.out.println("1. 사원추가");
			System.out.println("2. 사원전체출력");
			System.out.println("9. 프로그램종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			number = sc.nextInt();
			
			switch(number) {
			case 1:
				/*
				 * 사원추가기능
				 * 사원번호, 이름, 성별, 휴대폰번호입력받고
				 * 추가 정보를 더 입력하시겠습니까?(y/n)
				 * y일때만 부서, 연봉, 보너스율 입력받고
				 * 해당 데이터를 활용하여 emList에 사원추가
				 */
				this.insertEmp();
				break;
			case 2:
				ec.EmpList();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	//회원을 추가하기위한 정보를 입력받는 메소드
	public void insertEmp() {
		System.out.print("사원번호 : ");
		int empNo = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		//toLowerCase()  -> 모든 문자열 소문자로 변경
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		boolean isContinue = sc.next().toLowerCase().charAt(0) == 'y';
		if (isContinue) { // 추가정보를 입력받음(y를 입력했을 때)
			System.out.print("부서 : ");
			String dept = sc.next();
			
			System.out.print("연봉 : ");
			int salary = sc.nextInt();
			
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
		 
			ec.insert(empNo, name, gender, phone, dept, salary, bonus);
		} else { // 추가정보를 입력받지않음 n을 입력했을 때
			
			ec.insert(empNo, name, gender, phone, "부서없음", 0, 0.0);
		}
	}
}
