package Test240207;

import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	private HashMap<String, Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		boolean exist = true;
		if (map.containsKey(id)) {
			exist = false;
		} else {
			map.put(id, m);
		}
		return exist;
	}
	
	public String logIn(String id, String password) {
		String login = null;
		Member m = map.get(id); 
		if (m != null && m.getPassword().equals(password)) {
			login = m.getName();
		}
		return login;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean change = false;
		Member m = (Member)map.get(id); 
		if (m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			change = true;
		}
		return change;
	}
	
	public void changeName(String id, String newName) {
		if (map.containsKey(id)) {
			Member m = (Member)map.get(id);
			m.setName(newName);
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap<String, String> sameName = new TreeMap();
		for (String mapKey : map.keySet()) {
			if (map.get(mapKey).getName().equals(name)) {
				sameName.put(mapKey, name);
			}
		}
		return sameName;
	}
}
