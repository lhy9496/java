package practice;

public class MemberController {
	public int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	public MemberController() {
		m[0] = new Member("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'F', 33);
		m[1] = new Member("bbbbb", "강고결", "bb", "bbb@bbb.bbb", 'M', 34);
		m[2] = new Member("ccccc", "남나눔", "cc", "ccc@ccc.ccc", 'M', 28);
		m[3] = new Member("ddddd", "도대담", "dd", "ddd@ddd.ddd", 'M', 35);
		m[4] = new Member("eeeee", "류라라", "ee", "eee@eee.eee", 'F', 17);
		m[5] = new Member("fffff", "문미미", "ff", "fff@fff.fff", 'F', 20);
		m[6] = new Member("ggggg", "박보배", "gg", "ggg@ggg.ggg", 'M', 26);
		m[7] = new Member("hhhhh", "송성실", "hh", "hhh@hhh.hhh", 'M', 41);
		m[8] = new Member("iiiii", "윤예의", "ii", "iii@iii.iii", 'F', 28);
		m[9] = new Member("jjjjj", "정재주", "jj", "jjj@jjj.jjj", 'M', 23);
	}
	
	public int existMemberNum() {
		int count = 0;
		for (Member mem : m) {
			if (mem != null) {
				count++;
			}
		}
		return count;
	}
	
	public Boolean checkId(String inputID) {
		Boolean chkId = false;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(inputID)) {
				chkId = true;
			}
		}
		return chkId;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (Member mem : m) {
			if (mem == null) {
				mem = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		String sid = null;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(id)) {
				sid = mem.inform();
			}
		}
		return sid;
	}
	
	public Member[] searchName(String name) {
		Member[] sname = new Member[10];
		int count = 0;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(name)) {
				sname[count] = mem;
				count++;
			}
		}
		return sname;
	}
	
	public Member[] searchEmail(String email) {
		Member[] semail = new Member[10];
		int count = 0;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(email)) {
				semail[count] = mem;
				count++;
			}
		}
		return semail;
	}
	
	public Boolean updatePassword (String id, String password) {
		Boolean upass = false;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			}
			if (mem.getId().equals(id)) {
				mem.setPassword(password);
				upass = true;
			}
		}
		return upass;
	}
	
	public Boolean updateName (String id, String name) {
		Boolean uname = false;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(id)) {
				mem.setName(name);
				uname = true;
			}
		}
		return uname;
	}
	
	public Boolean updateEmail(String id, String email) {
		Boolean uemail = false;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(id)) {
				mem.setName(email);
				uemail = true;
			}
		}
		return uemail;
	}
	
	public Boolean delete(String id) {
		Boolean del = false;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else if (mem.getId().equals(id)) {
				mem = null;
				del = true;
			}
		}
		return del;
	}
	
	public void delete() {
		for (Member mem : m) {
			mem = null;
		}
	}
	
	public Member[] printAll() {
		Member[] pa = new Member[10];
		int count = 0;
		for (Member mem : m) {
			if (mem == null) {
				continue;
			} else {
			pa[count] = mem;
				count++;
			}
		}
		return pa;
	}
}
