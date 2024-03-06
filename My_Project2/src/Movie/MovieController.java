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
			new MovieMenu().displayNoData("영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public void ReserveList() { //예매한 영화 목록
		HashMap<Integer, Movie> result = new MovieService().ReserveList();
		if (result.isEmpty()) {
			new MovieMenu().displayNoData("영화가 없습니다.");
		} else {
			new MovieMenu().displayMovieList(result);
		}
	}
	
	public searchTitle(String title) { //영화 제목 검색결과
		
	}
	
	public searchGenre(String genre) { //영화 장르 검색결과
		
	}
	
	public searchAge(int age) { //영화 연령제한 검색결과
		
	}
	
	public Movie checkMovie(int serial) { //영화유무 확인
		
	}
	
	public boolean checkAge(Movie m) { //연령대 확인
		
	}
	
	public boolean checkAvailable(Movie m) { //매진 여부 확인
		
	}
	
	public boolean reserveTicket(int serial, int ticket) { //예매할 티켓 수 확인
		
	}
	
	public boolean reserveCancel(int serial) { //예매 취소
		
	}
}
