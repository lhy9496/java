package test8;

public class User implements Cloneable{
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender
				+ " " + phone;
	}

	public boolean equals(Object obj) {
		if (obj.toString().equals(this.toString())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public Object clone(){
		User newUser = new User();
		newUser.setId(this.id);
		newUser.setPassword(this.password);
		newUser.setName(this.name);
		newUser.setAge(this.age);
		newUser.setGender(this.gender);
		newUser.setPhone(this.phone);
		return newUser;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
