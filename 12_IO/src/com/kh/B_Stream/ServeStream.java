package com.kh.B_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServeStream {
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공/데이터 전송 속도 향상
	 * >>외부매체와 직접적으로 연결되는 스트림이 아니라 단독 사용 불가 =>반드시 기반스트림과 함께 사용
	 */
	
	//프로그램 -> 파일(출력)
	public void fileSave() {
		//FileWriter : 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 기반 스트림
		
		BufferedWriter bw = null;
		try {
			//1. 기반스트림 먼저 생성
//			FileWriter fw = new FileWriter("c_buffer.txt");
		
			//2. 보조스트림 생성 시 기반스트림 객체를 전달하면서 생성
//			BufferedWriter bw = new BufferedWriter(fw);
			
			//한꺼번에 생성 가능
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine();
			bw.write("끝");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		//FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 객체
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			int value = 0;
			while((value = br.read()) != -1) {
				System.out.print((char)value);
				}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void objectSave() {
		
		//출력할 데이터 (Product객체)
		Product phone1 = new Product("아이폰1", 1000000);
		Product phone2 = new Product("아이폰2", 2000000);
		Product phone3 = new Product("아이폰3", 3000000);
		
		//FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		//ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter)
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_product.txt"))){
			
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_product.txt"))){
			while(true) {
			System.out.println(ois.readObject());
			}
			
		} catch (EOFException e) {
			System.out.println("파일을 전부 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
