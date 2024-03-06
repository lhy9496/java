package com.kh.A_file;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		//1. 경로지정을 딱히 하지 않고 파일을 생성
		
		File f1 = new File("test.text"); // 파일 객체 생성(실제 파일이 만들어진 건 아님)
		
		//2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정
		File f2 = new File("D:\\test.text");
		
		//3. 폴더 먼저 만들고 파일까지 만들어지게 하는 방법
		File tmpFolder = new File("D:\\tmp");
		tmpFolder.mkdir(); //폴더가 만들어지가 하는 메소드
		
		File f3 = new File("D:\\tmp\\test.text");
		try {
			f1.createNewFile(); // 메소드까지 실행해야 파일이 만들어진다.
			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException
			f3.createNewFile();
			
			System.out.println(f1.exists()); // 파일의 존재유무 확인
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); // 파일인지 확인하는 메소드
			System.out.println(tmpFolder.isFile());
			
			//-----------------------------------------------------
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
}
