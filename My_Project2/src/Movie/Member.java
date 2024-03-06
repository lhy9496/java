package Movie;

public class Member {
	private String name;
	private int age;
	private char gender;
	
	public Member() {
		super();
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " / 나이 : " + age + "세";
	}
	
	
}
