package test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date birth = new Date(1987 - 1900, 05-1, 27);
		Date now = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		String birthsdf = sdf1.format(birth);
		String nowsdf = sdf2.format(now);
		
		System.out.println("생일 : " + birthsdf);
		System.out.println("현재 : " + nowsdf);
		System.out.printf("나이 : %d세", (now.getYear()-birth.getYear()));
	}
}
