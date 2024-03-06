import java.util.Scanner;
public class B_switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*
	 * switch문도 if문과 동일하게 조건문이다.
	 * 
	 * 차이점
	 * if문 : 조건식을 자유롭게 기술 가능하다.
	 * switch문 : 동등비교로만 수행되며, 실행할 구문만 실행하고 자동으로 빠져나올 수 없다.
	 * 
	 * [표현법]
	 * switch(비교대상(정수, 문자, 문자열)) {
	 * case 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * ...
	 * default: 위의 값들이 모두 일치하지 않았을 때 실행하는 코드;
	 * }
	 * 
	 */
		/*
		 * 정수를 입력해서 "xx색입니다."
		 * 1은 빨강, 2는 파랑, 3은 초록
		 * 그 외에는 "잘못 입력하였습니다."
		 */
		
//		int num;
//		
//		System.out.print("정수(1~3) : ");
//		num = sc.nextInt();
		
		//switch
//		switch(num) {
//		case 1:
//			System.out.println("빨간색입니다."); break;
//		case 2:
//			System.out.println("파란색입니다."); break;
//		case 3:
//			System.out.println("초록색입니다."); break;
//		default:
//			System.out.println("잘못 입력하였습니다.");
//		}
		//if
//		if(num==1) {
//			System.out.println("빨간색입니다.");
//		} else if(num==2) {
//			System.out.println("파란색입니다.");
//		} else if(num==3) {
//			System.out.println("초록색입니다.");
//		} else {
//			System.out.println("잘못 입력하였습니다.");
//		}
		
		//과일을 구매하는 프로그램
		//구매하려는 과일을 입력하면 가격이 출력되는 구조
		//구매하고자 하는 과일(사과(1000), 바나나(2000), 딸기(3000)) 입력 : ()
		//xx의 가격은 xxxx입니다. 또는 잘못 입력하였습니다.
		/*
		int price = 0;
		String fruit;
		
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 딸기) 입력 : ");
		fruit = sc.nextLine();
		
		switch(fruit) {
		case "사과" :
			System.out.println("사과의 가격은 1000원입니다."); break;
		case "바나나" :
			System.out.println("바나나의 가격은 2000원입니다."); break;
		case "딸기" :
			System.out.println("딸기의 가격은 3000원입니다."); break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}
		*/
		
		int month, day;
		System.out.println("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 0;
			System.out.println("1~12까지만 입력가능합니다");
			return;
		}
		
		System.out.println(month+"월은 "+ day+"일 까지입니다");
		
	}
}
