package test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		list.add(54);
//		list.add(75);
//		list.add(14);
//		list.add(41);
//		list.add(52);
//		list.add(61);
//		list.add(43);
//		list.add(87);
//		list.add(43);
//		list.add(3);
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100 + 1));
		}
		ListTest lt = new ListTest();
		
		System.out.print("정렬 전 : ");
		lt.display(list);
		
		Collections.sort(list, new Decending().reversed());
		System.out.println();
		
		System.out.print("정렬 후 : ");
		lt.display(list);

	}
	
	
	public void display(List list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}
