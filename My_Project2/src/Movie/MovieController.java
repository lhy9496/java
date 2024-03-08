package Movie;

import java.sql.Connection;
import java.util.HashMap;

import Movie.jdbc.JDBCTemplate;
import Movie.jdbc.MovieDao;
import Movie.jdbc.MovieService;

public class MovieController {
	private Member mem;
	
	public MovieController() {
	}	
	
	public void entryMember(String name, int age) {
		mem = new Member(name, age);
	}
	
	public Member meminfo() { //회원 정보 확인
		return mem;
	}
	
	public void MovieList() { //영화 목록
		HashMap<Integer, Movie> result = new MovieService().MovieList();
		if (result.isEmpty()) {
			new MovieMenu().displayNoData("열람 가능한 영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public void ReserveList() { //예매한 영화 목록
		HashMap<Integer, Movie> result = new MovieService().ReserveList();
		if (result.isEmpty()) {
			new MovieMenu().displayNoData("예매하신 영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public void searchTitle(String title) { //영화 제목 검색결과
		HashMap<Integer, Movie> result = new MovieService().searchTitle(title);
		if(result.isEmpty()) {
			new MovieMenu().displayNoData("검색 결과에 해당하는 영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public void searchGenre(String genre) { //영화 장르 검색결과
		HashMap<Integer, Movie> result = new MovieService().searchGenre(genre);
		if(result.isEmpty()) {
			new MovieMenu().displayNoData("검색 결과에 해당하는 영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public void searchAge(int age) { //영화 연령제한 검색결과
		HashMap<Integer, Movie> result = new MovieService().searchAge(age);
		if(result.isEmpty()) {
			new MovieMenu().displayNoData("검색 결과에 해당하는 영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public Movie checkMovie(int serial) { //영화유무 확인
		Movie m = new MovieService().checkMovie(serial);
		return m;
	}
	
	public Movie checkReserve(int serial) {
		Movie r = new MovieService().checkReserve(serial);
		return r;
	}
	
	public boolean checkAge(Movie m) { //연령대 확인
		boolean check = true;
		if (m.getAccessAge() > mem.getAge()) {
			check = false;
		}
		return check;
	}
	
	public boolean checkAvailable(Movie m) { //매진 여부 확인
		boolean check = true;
		if (m.getTicket() == 0) {
			check = false;
		}
		return check;
	}
	
	public void reserveTicket(int serial, Movie m, int ticket) { //예매할 티켓 수 확인
		int result = new MovieService().reserveTicket(serial, m, ticket);
		if (result > 0) {
			new MovieMenu().displaySuccess("티켓이 예매되었습니다.");
		} else {
			new MovieMenu().displayFail("남은 영화표의 수보다 많습니다.");
		}
	}
	
	public void reserveCancel(int serial) { //예매 취소
		int result = new MovieService().reserveCancel(serial);
		if (result > 0) {
			new MovieMenu().displaySuccess("예매가 취소되었습니다.");
		} else {
			new MovieMenu().displayFail("예매 목록에 포함되어 있지 않은 영화입니다.");
		}
	}
}
