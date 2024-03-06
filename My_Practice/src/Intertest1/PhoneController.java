package Intertest1;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		result = new String[phones.length];
		for (int i = 0; i < phones.length; i++) {
			result[i] = ((SmartPhone)phones[i]).printInformation();
		}
		return result;
	}
}
