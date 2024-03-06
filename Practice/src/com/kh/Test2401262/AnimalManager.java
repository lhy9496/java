package com.kh.Test2401262;

public class AnimalManager {
	/*
	 * 추상클래스
	 * - 미완성된 클래스
	 * - 객체생성이 불가(단, 레퍼런스 변수(참조변수) 선언은 가능
	 * - 일반 필드 + 일반메소드 [+추상메소드]
	 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야 됨
	 * 
	 * * 추상메소드가 굳이 없어도 추상클래스는 사용 가능
	 * > 개념적 : 단지 이 클래스가 미완성된 클래스라는 걸 알리기 위함
	 * > 프로그래밍적 : 객체 생성이 불가하게끔 하고자 할 때
	 * 
	 * * 추상메소드가 있는 추상클래스를 사용하는 이유
	 * - 부모클래스에 추상메소드가 존재할 경우
	 *   자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 된다.
	 *   =>각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
	 */
	public static void main(String[] args) {

		Animal[] ani = new Animal[5];
		ani[0] = new Dog("바둑이" ,"진돗개", 15);
		ani[1] = new Cat("나비", "벵골", "오두막", "노랑");
		ani[2] = new Dog("삽살이" ,"삽살개", 10);
		ani[3] = new Dog("방울이" ,"허스키", 20);
		ani[4] = new Cat("펠릭스", "샴", "아파트", "검정");
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].speak();
		}
	}
}
