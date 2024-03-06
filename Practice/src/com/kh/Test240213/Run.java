package com.kh.Test240213;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//홀수 짝수 출력하기	
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 != 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		//랜덤으로 숫자 5개 입력받아 출력하기
//		for (int i = 0; i < 5; i++) {
//			System.out.print((int)(Math.random() * 100) + 1 + " ");
//		}
		
		//랜덤으로 숫자 10개 입력받아 짝수만 출력하기
//		for (int i = 0; i < 10; i++) { // i가 10에 다다를 때까지 반복
//			int j = (int)((Math.random() * 100) + 1); // j에 랜덤한 숫자 부여
//			if (j % 2 == 0) { // j가 짝수인지 판별
//			System.out.print(j + " "); // j가 짝수라면 출력
//			}
//		}
		
		//문자열 입력받아서 문자열 한글자씩 출력하기
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		
		
		//문자열(영단어) 입력받아서 문자열 첫글자 대문자로 변경하기
//		String str = sc.next(); // 문자열 str을 입력
//		char str1 = str.toUpperCase().charAt(0); // 문자 객체 str1에 대문자가 된(toUpperCase) str의 첫글자(charAt(0))를 담기 
//		String str2 = str.substring(1); // str2에 str의 두번째 글자부터 끝까지(substring(1) 담기
//		System.out.println(str1 + str2); // str1과 str2를 한꺼번에 출력하면 첫글자가 대문자가 된 str이 출력됨
		
		
		//오버라이딩, 오버로딩에 대한 문제
		// Q. 상속 관계에 있는 클래스 2개를 제공해주고 오버라이딩된 메소드 출력시 어떤 결과가 출력되나?
		// A. 자식 클래스에서 정의한 내용대로 출력된다.
		
		//클래스 하나 주어진 상태에서 해당 클래스를 상속받는 새로운 클래스를 만들고 다음과 같은 결과가 되도록 오버라이딩을 해라
		
		// Q. 똑같은 이름의 메소드를 10개 제공해주고 에러가 발생하는 이유를 기술해라
		// A. 매개변수의 개수와 타입이 완전히 동일한 메소드가 둘 이상 존재하기 때문이다.
		
		// void sample(int n); -> sample(3); sample(5, 7.0); 해당 코드가 문제되지 않도록 코드를 수정해라
		// void sample(int n, double x); 를 추가한다.
		
		//배열 -> 길이가 정해져있는 것 -> 배열의 범위를 초과하는 코드조심
		//배열을 제공하고 모든 객체를 출력해라
//		int[] intarr = new int[10];
//		for (int i = 0; i < intarr.length; i++) {
//			intarr[i] = i;
//			System.out.print(i + " ");
//		}
		
		//다형성 -> 다운캐스팅 조심
		
		//Human을 담을 수 있는 ArrayList 1개를 생성하고 임의로 Human 객체 5개를 생성해서 담아라
		//단, 해당 List에는 Human 객체만 담을 수 있게 구성할 것
//		ArrayList<Human> huarr = new ArrayList<Human>();
//		huarr.add(new Human("A"));
//		huarr.add(new Human("B"));
//		huarr.add(new Human("C"));
//		huarr.add(new Human("D"));
//		huarr.add(new Human("E"));
		
		
		//ArrayList<Human> = new ArrayList<>();
		//arr.add(new Human("최지원"));
		//arr.add("김수민");
		//Q. 해당 코드의 문제점 찾기
		//A. 해당 코드의 ArrayList는 Human 객체만 담을 수 있는데, "김수민"은 String 객체이기 때문에 담을 수 없다.
		
		//파일에 내용작성하기, 파일로부터 내용 가져오기
//		try (FileWriter fw = new FileWriter("Hwtest.txt")){
//			fw.write("Hello World!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try (FileReader fr = new FileReader("Hwtest.txt")){
//			int value = 0;
//			while((value = fr.read()) != -1) {
//				System.out.print((char)value);
//			}		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//파일에 객체정보 저장하기(직렬화), 파일로부터 객체정보 가져오기(역직렬화)
//		object ob = new object();
//		
//		ob.objectWrite();
//		
//		ob.objectRead();
		
		//UDP 또는 TCP에서 클라이언트, 서버 구성하기
		
	}
}
