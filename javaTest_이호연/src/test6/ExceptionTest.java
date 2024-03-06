package test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) throws InvalidException {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		int data = sc.nextInt();
		System.out.println(c.getSum(data));
	}
}
