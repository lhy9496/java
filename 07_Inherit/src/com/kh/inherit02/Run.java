package com.kh.inherit02;

public class Run {
	/*
	*	상속의 장점
	*	-보다 적은 양의 코드로 새로운 클래스 작성 가능
	*	-코드를 공통으로 관리하기 때문에 코드의 추가나 변경이 용이(프로그램의 생산성, 유지보수성이 좋아짐)
	*
	*	상속의 특징
	*	-클래스간의 상속에 있어서는 다중상속이 불가(즉, 부모는 하나)
	*	-부모클래스에 정의되어 있는 protected 필드는 자식클래스에서 직접 접근이 가능
	*	-자식객체는 부모클래스에 정의되어 있는 메소드를 마치 내 것처럼 호출 가능
	*	 +부모클래스의 정의된 기능이 마음에 들지 않는다면 내 마음대로 수정 가능
	*	-
	*
	*/
	public static void main(String[] args) {
		Tv t = new Tv("엘지", "t-01", "엄청얇은티비", 350000, 65);
		Desktop d = new Desktop("삼성", "d-01", "엄청고사양데스크탑", 2600000, true);
		SmartPhone s = new SmartPhone("애플", "p-01", "아이폰", 1300000, "SK");
		
		/*
		 * 세 클래스의 공통적인 필드와 메소드들이 존재
		 * 이런 중복된 코드들을 따로 "부모"클래스로 한 번만 정의해두면 중복된 코드들을 줄일 수 있다.
		 * =>	수정과 같은 유지보수 요청이 들어왔을 때 일일이 찾아서 수정할 필요 없이
		 * 		한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영이 된다.
		 */
		System.out.println(t.information());
		System.out.println(d.information());
		System.out.println(s.information());
	}
}
