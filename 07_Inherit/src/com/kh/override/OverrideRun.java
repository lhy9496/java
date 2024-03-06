package com.kh.override;

public class OverrideRun {
	public static void main(String[] args) {
		Book b = new Book("홍길동전", "허균");
		System.out.println(b);
		/*
		 * 참조변수를 호출하면 자동으로 .toString()가 호출된다.
		 * 
		 * 오버라이딩 전 : Object 클래스의 toString() 실행 => 풀클래스명 + @ + 객체의 해쉬코드 16진수값
		 * 오버라이딩 후 : Book 클래스의 toString() 실행 => 해당 객체가 가지고 있는 모든 필드 값을 한 문자열로 반환
		 */
		
		/*
		 * *오버라이딩
		 * - 자식클래스가 상속받고 있는 부모 클래스의 메소드를 재정의하는 것
		 * - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미 
		 *   자식객체를 통해 실행시 자식메소드가 우선권을 가짐
		 *   
		 * *오버라이딩 성립조건
		 * - 부모메소드명과 동일
		 * - 매개변수 갯수, 자료형, 순서 동일(매개변수명은 상관없음)
		 * - 부모메소드의 반환형 동일
		 * - 부모메소드의 접근제한자보다 범위가 같거나 커야 한다.
		 *   ex)부모메소드의 접근제한자가 protected일 경우, 오버라이딩당하는 메소드의 접근제한자는 protected나 public이어야 한다.
		 *   
		 *  => 규약의 개념이 들어가 있음
		 *  
		 *  * @Override 어노테이션
		 *  - 생략 가능, 크게 상관없음(명시하지 않아도 된다.)
		 *  - 어노테이션을 붙이는 이유
		 *   >> 부모 메소드명이나 매개변수가 수정될 경우 -> 찾아보기 쉽다.
		 *   >> 메소드가 오버라이딩한 메소드라는 사실을 직관적으로 알 수 있다.
		 */
	}
}
