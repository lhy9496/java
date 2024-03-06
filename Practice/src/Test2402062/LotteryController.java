package Test2402062;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet();
	private HashSet<Lottery> win = new HashSet();
	
	public LotteryController() { //임시 추첨 대상 목록
		lottery.add(new Lottery("박신우", "01011112222"));
		lottery.add(new Lottery("송성실", "01022223333"));
		lottery.add(new Lottery("문미미", "01033334444"));
		lottery.add(new Lottery("강건강", "01044445555"));
		lottery.add(new Lottery("윤예의", "01055556666"));
		lottery.add(new Lottery("류라라", "01066667777"));
	}
	
	public boolean insertObject(Lottery l) {
		boolean result = false;
		int before = lottery.size();
		lottery.add(l);
		if (lottery.size() == before) {
			result = true;
		}
		return result;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = true;
		if (lottery == null || win == null) {
			result = false;
		} else if (lottery.contains(l)) {
			lottery.remove(l);
			if (win.contains(l)) {
				win.remove(l);
			}
		} else {
			result = false;
		}
		return result;
	}
	
	public HashSet winObject() {
		ArrayList list = new ArrayList();
		list.addAll(lottery);
		while(win.size() < 4) {
			int i = (int)(Math.random() * lottery.size());
			win.add((Lottery)list.get(i));
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet<Lottery> sortwin = new TreeSet<>(new SortedLottery());
		if (win.size() == 0) {
			return sortwin;
		}
		for (Lottery lo : win) {
			sortwin.add(lo);
		}
		return sortwin;
	}
	
	public boolean searchWinner(Lottery l) {
		boolean result = false;
		if (win.contains(l)) {
			result = true;
		}
		return result;
	}
}
