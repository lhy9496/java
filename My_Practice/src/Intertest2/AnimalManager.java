package Intertest2;

public class AnimalManager {
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
