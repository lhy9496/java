package Test240208;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Test240206.Book;

public class MusicController {
	private List<Music> list = new ArrayList();
	
//	public MusicController() {
//		list.add(new Music("작은 것들을 위한 시", "방탄소년단"));
//		list.add(new Music("소우주", "방탄소년단"));
//		list.add(new Music("주저하는 연인들을 위해","잔나비"));
//		list.add(new Music("빙고","거북이"));
//		list.add(new Music("가위", "유승준"));
//		list.add(new Music("하여가","서태지와 아이들"));
//	}
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return this.list;
	}
	
	public Music searchMusic(String title) {
		Music sM = null;
		for(Music m : list) {
			if (m.getTitle().equals(title)) {
				sM = m;
			}
		}
		return sM;
	}
	
	public Music removeMusic(String title) {
		Music rM = null;
		for(Music m : list) {
			if (m.getTitle().equals(title)) {
				rM = new Music(m.getTitle(), m.getSinger());
				list.remove(list.indexOf(m));
			}
		}
		return rM;
	}
	
	public Music setMusic(String title, Music music) {
		Music stM = null;
		for(Music m : list) {
			if (m.getTitle().equals(title)) {
				stM = new Music(m.getTitle(), m.getSinger());
				list.set(list.indexOf(m), music);
			}
		}
		return stM;
	}
	
	public int ascTitle() {
		int num = 0;
		if (list.size() == 0) {
			return num;
		}
		Collections.sort(list, new AscTitle());
		num = 1;
		return num;
	}
	
	public int descSinger() {
		int num = 0;
		if (list.size() == 0) {
			return num;
		}
		Collections.sort(list, new AscTitle().reversed());
		num = 1;
		return num;
	}
}
