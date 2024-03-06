package test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {
	public static void main(String[] args){
		// BufferedReader 에 대해 선언한다.
		BufferedReader br = null;
		Goods goods = new Goods();
		
		//br 에 대한 키보드 입력스트림 객체 생성하고, 입력 처리하고 출력처리 한다.
		//try catch resource 문으로 작성한다.

		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("다음 항목의 값을 입력하시오.");
		try {
			System.out.print("상품명 : ");
			String name = br.readLine();
			goods.setName(name);
			
			System.out.print("가격 : ");
			int price = Integer.parseInt(br.readLine());
			goods.setPrice(price);
			
			System.out.print("수량 : ");
			int quantity = Integer.parseInt(br.readLine());
			goods.setQuantity(quantity);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString());
	}
}
