package test13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7,", (new Date(2016-1900, 3-1, 15)), 30));
		map.put("LG G5", new Inventory("LG G5,\t", new Date(2016-1900, 2-1, 25), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro,", new Date(2016-1900, 1-1, 23), 15));
		
		for (Entry<String, Inventory> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		
		System.out.println("출고 수량 10 적용시 ----------------------------------------------------------");

		Inventory[] invarr = new Inventory[3];
		invarr[0] = map.get("삼성 갤럭시S7");
		invarr[1] = map.get("LG G5");
		invarr[2] = map.get("애플 아이패드 Pro");
		
		for (int i = 0; i < invarr.length; i++) {
			invarr[i].setGetDate(new Date());
			try {
				invarr[i].setGetAmount(10);
			} catch (AmountNotEnough e) {
				System.out.println("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
				return;
			}	
		}
		for (int i = 0; i < invarr.length; i++) {
			System.out.println(invarr[i]);
		}
		
		System.out.println("출고수량 부족시 ---------------------------------------------------------------");
		
		for (int i = 0; i < invarr.length; i++) {
			invarr[i].setGetDate(new Date());
			try {
				invarr[i].setGetAmount(10); 
				
			} catch (AmountNotEnough e) {
				System.out.println("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
				return;
			}	
		}
		for (int i = 0; i < invarr.length; i++)
			System.out.println(invarr[i]);
	}
}
