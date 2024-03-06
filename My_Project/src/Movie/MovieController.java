package Movie;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class MovieController {
	private HashMap<Integer, Movie> cinema = new HashMap<Integer, Movie>();
	private HashMap<Integer, Movie> reserved = new HashMap<Integer, Movie>();
	private Member mem;
	
	public MovieController() {
		HashMap<Integer, Movie> incinema = new MovieJDBC().insertCinema();
		cinema = (HashMap<Integer, Movie>)incinema.clone();
	}
	
	public void entryMember(String name, int age) {
		mem = new Member(name, age);
	}
	
	public Member meminfo() {
		return mem;
	}
	
	public void MovieList() { //영화 목록
		if(cinema.isEmpty()) {
			System.out.println("영화가 없습니다.");
		} else {
			cinema.forEach((Integer, Movie) -> {
				System.out.println(Integer + "/ " + Movie.toString());
			});
		}
	}
	
	public void ReserveList() { //예매한 영화 목록
		if(reserved.isEmpty()) {
			System.out.println("예매하신 영화가 없습니다.");
		} else {
			reserved.forEach((Integer, Movie) -> {
				System.out.println(Integer + "/ " + Movie.toString());
			});
		}
	}
	
	public HashMap<Integer, Movie> searchTitle(String title) { //영화 제목 검색결과
		HashMap<Integer, Movie> sct = new HashMap<Integer, Movie>();
		cinema.forEach((Integer, Movie) -> {
			if (Movie.getTitle().contains(title)) {
				sct.put(Integer, Movie);
			}
		});
		return sct;
	}
	
	public HashMap<Integer, Movie> searchGenre(String genre) { //영화 장르 검색결과
		HashMap<Integer, Movie> scg = new HashMap<Integer, Movie>();
		cinema.forEach((Integer, Movie) -> {
			if (Movie.getGenre().contains(genre)) {
				scg.put(Integer, Movie);
			}
		});
		return scg;
	}
	
	public HashMap<Integer, Movie> searchAge(int age) { //영화 연령제한 검색결과
		HashMap<Integer, Movie> sca = new HashMap<Integer, Movie>();
		cinema.forEach((Integer, Movie) -> {
			if (Movie.getAccessAge() <= age) {
				sca.put(Integer, Movie);
			}
		});
		return sca;
	}
	
	public Movie checkMovie(int serial) { //영화유무 확인
		Movie cm = null;
		if (cinema.containsKey(serial)) {
			cm = (Movie)cinema.get(serial);
		}
		return cm;
	}
	
	public boolean checkAge(Movie m) { //연령대 확인
		boolean chkage = true;
		if (m.getAccessAge() > mem.getAge()) {
			chkage = false;
		}
		return chkage;
	}
	
	public boolean checkAvailable(Movie m) { //매진 여부 확인
		boolean chkabl = true;
		if (m.getTicket() == 0) {
			chkabl = false;
		}
		return chkabl;
	}
	
	public boolean reserveTicket(int serial, int ticket) { //예매할 티켓 수 확인
		boolean restck = false;
		if (cinema.containsKey(serial)) {
			if (cinema.get(serial).getTicket() >= ticket) {
				Movie rtm = cinema.get(serial);
				reserved.put(serial, new Movie(rtm.getTitle(), rtm.getGenre(), rtm.getAccessAge(), ticket));
				cinema.replace(serial, rtm).setTicket(rtm.getTicket() - ticket);
				restck = true;
			}
		}
		return restck;
	}
	
	public boolean reserveCancel(int serial) {
		boolean rescan = false;
		if (reserved.containsKey(serial)) {
			int ticket = reserved.get(serial).getTicket();
			Movie rcm = cinema.get(serial);
			reserved.remove(serial);
			cinema.replace(serial, rcm).setTicket(rcm.getTicket() + ticket);
			rescan = true;
		}
		return rescan;
	}
}
