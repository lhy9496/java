package Intertest1;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] results = pc.method();
		for (String result : results) {
			System.out.println(result);
			System.out.println();
		}
			
	}
}
