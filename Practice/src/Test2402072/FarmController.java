package Test2402072;

import java.util.ArrayList;
import java.util.HashMap;

//Controller : 사용자가 요청한 내용을 처리한 후, 그 결과를 돌려주는 역할
public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		boolean aNK = true;
			if(hMap.containsKey(f)) {
				aNK = false;
			} else {
				hMap.put(f, amount);
			}
		return aNK;
	}
	
	public boolean removeKind(Farm f) {
		boolean rK = false;
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			rK = true;
		}
		return rK;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		boolean cA = false;
		if(hMap.containsKey(f)) {
			hMap.replace(f, amount);
			cA = true;
		}
	return cA;
	}
	
	public HashMap<Farm, Integer> printFarm(){
		HashMap<Farm, Integer> pF = hMap;
		return pF;
	}
	
	public boolean buyFarm(Farm f) {
		boolean bF = false;
		if(hMap.containsKey(f) && hMap.get(f) > 0) {
			list.add(f);
			hMap.replace(f, hMap.get(f)-1);
			bF = true;
		}
		return bF;
	}
	
	public boolean removeFarm(Farm f) {
		boolean rF = false;
		if(list.contains(f)) {
			list.remove(f);
			hMap.replace(f, hMap.get(f)+1);
			rF = true;
		}
		return rF;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		ArrayList<Farm> pBF = list;
		return pBF;
	}
}
