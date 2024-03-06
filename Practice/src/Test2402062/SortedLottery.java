package Test2402062;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{
	public int compare(Lottery o1, Lottery o2) {
		int num = o1.getName().compareTo(o2.getName());
		if (num == 0) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		
		return num;
	}
	
}
