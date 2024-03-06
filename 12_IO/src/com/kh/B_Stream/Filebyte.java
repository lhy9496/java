package com.kh.B_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filebyte {
	/*
	 * "바이트 기반 스트림"을 통한 입출력해보기
	 * 
	 * - 바이트스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로 -> 한글 깨짐)
	 * - 기반스트림 : 외부매체와 직접적으로 연결하는 통로
	 * 
	 * xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부데이터를 읽어오겠다.)
	 * xxxOutputStream : xxx매체로부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다.)
	 */
	
	//프로그램(자바) -> 외부매체(파일) 데이터를 출력(프로그램상의 데이터를 파일로 내보내겠다.)
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			//1. FileOutputStream 객체 생성 => 해당파일과의 연결통로 만들기
			//해당 파일이 없으면 새로 만들어주고 통로 연결 / 있으면 있는 파일에 통로 연결
			/*
			 * true 미작성시
			 */
			fout = new FileOutputStream("a_byte.txt");

			//2. 파일에 데이터를 출력해보자
			//	 숫자를 출력하든 문자를 출력하든 실제로는 파일에 문자로 기록이 된다(아스키코드표)
			//	 (0~127)
			fout.write(97); // 'a'문자가 저장
			fout.write('b'); // 'b'문자가 저장
			fout.write('얍'); // 한글은 2byte짜리라 깨져서 저장됨 => 바이트스트림으로는 제한이 있다.
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde 문자가 저장됨
			
			//fout.write(byte[] b, int off, int len) : byte배열의 off인덱스부터 len개만큼 출력
			fout.write(arr, 0, 2);
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 이 안에 작성된 코드는 어떤 예외가 있더라도 마지막에 무조건 실행하고 빠져나가도록 한다.
			try {
				//3. 스트림을 다 이용했으면 무조건 반납하기(반드시)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	
	//외부매체 -> 프로그램(자바) 데이터를 입력(파일로부터 데이터를 읽어들이겠다)
	public void fileRead() {
		
		//FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		//1. 스트림 생성(통로만들기)
		//2. 스트림 통해서 입력받아옴(메소드활용)
		//3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		
		try {
			//1. FileOutputStream 객체 생성 => 해당파일과의 연결통로 만들기
			fin = new FileInputStream("a_byte.txt");
			
			//2. 파일로부터 데이터를 읽어들이고자 할 때 read메소드 사용
			//	 1byte단위로 하나씩 읽어옴 / 숫자로 읽어들임
			
			//반복출력 1. 무한반복을 돌리면서 매번 검사해보기
			
			while(true) {
			int value = fin.read();
			 // 파일의 끝을 만나면 -1을 반환.
			if (value == -1) {
				break;
			}
			System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}