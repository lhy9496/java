package co.kh.Test240201;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		File testFolder = new File("D:\\test");
		testFolder.mkdir();
		int select;
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1: //1. 노트 새로 만들기
				fileSave();
				break;
			case 2: //2. 노트 열기
				fileOpen();
				break;
			case 3: //3. 노트 열어서 수정하기
				fileEdit();
				break;
			case 9: //9. 끝내기
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() { //1. 노트 새로 만들기
		
		StringBuilder sb = new StringBuilder();
		
		//내용 입력 구간
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String word = sc.nextLine();
			if ((word.equals("ex끝it"))) {
				sb.delete(sb.length()-1, sb.length());
				break;
			} 
			sb.append(word + "\n");
		}
		
		//파일명 입력 구간
		System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		String newfile = sc.next();
		
			//중복 여부 확인 => 덮어쓰기 or 파일명 다시 입력 선택 구간
			while (fc.checkName(newfile)) { //
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
				char overwrite = sc.next().toLowerCase().charAt(0);
				if (overwrite == 'y') {//덮어쓰기 선택
					break;
				} else {//파일명 다시 입력 선택
					System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
					newfile = sc.next();
				}
			}
			
		fc.fileSave(newfile, sb);
		
	}
	
	public void fileOpen() { //2. 노트 열기
		
		System.out.print("열 파일명 : ");
		String opfile = sc.next();
		if (fc.checkName(opfile)) { //노트 발견, 내용 출력
			System.out.println(fc.fileOpen(opfile));
		} else { //노트 발견 실패
			System.out.println("없는 파일입니다.");
		}	
	}
	
	public void fileEdit() { //3. 노트 열어서 수정하기
		String edfile;
		System.out.print("열 파일명 : ");
		edfile = sc.next();
		if (fc.checkName(edfile)) { //노트 발견, 열어서 수정 개시
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String word = sc.nextLine();
				if ((word.equals("ex끝it"))) {
					sb.delete(sb.length()-1, sb.length());
					break;
				}
				sb.append(word + "\n");
			}
			fc.fileEdit(edfile, sb);
		} else { // 노트 발견 실패
			System.out.println("없는 파일입니다.");
			
		}	
	}
}
