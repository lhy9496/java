package Test240208;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{
	public int compare(Music o1, Music o2) {
		int num = o1.getTitle().compareTo(o2.getTitle());
		if (num == 0) {
			num = o1.getSinger().compareTo(o2.getSinger());
		}
		return num;
	}
	
}
