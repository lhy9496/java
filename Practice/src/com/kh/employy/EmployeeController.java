package com.kh.employy;

/*
 * 실제 정보를 넘겨받아서 사원에대한 정보를 저장하거나
 * 반환해주는 역할
 */
public class EmployeeController {
	private Employee[] emList = new Employee[100];
	
	//insert => 사원을 배열에 추가해주는 메소드
	public void insert(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		for (int i = 0; i < emList.length; i++) {
			if (emList[i] == null) {
				emList[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
				break;
			}
		}
	}
	
	//EmpList => 사원 전체 목록 출력 메소드
	public void EmpList() {
		System.out.println("===== 사원 목록 =====");
		for (int i = 0; emList[i] != null; i++) {
			System.out.println(emList[i].toString());
		}
	}
}
