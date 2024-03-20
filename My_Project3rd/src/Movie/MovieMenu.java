package Movie;

import java.util.Scanner;

public class MovieMenu {
	Scanner sc = new Scanner(System.in);
	MovieController mvc = new MovieController();
	
	public void MovieMainMenu() {
		/*
		 * 로그인한 회원 정보
		 * 
		 * 1. 영화 목록 MovieList()
		 * 2. 영화 검색 searchMovie()
		 * 3. 영화 예매 reserveTicket()
		 * 4. 예매한 영화 목록 reserveList()
		 * 5. 예매 취소 reserveCancel()
		 * 9. 로그아웃
		 */
	}
	
	public void searchMovie() {
		/*
		 * 1. 제목으로 검색 searchTitle()
		 * 2. 장르로 검색 searchGenre()
		 * 3. 연령제한으로 검색 searchAge()
		 * 4. 되돌아가기
		 */
	}
	
	public void reserveTicket() {}
	
	public void reserveList() {}
	
	public void reserveCancel() {}
	
	public void displaySuccessMovie() {}
	
	public void displayFailMovie() {}
	
	public void displayNoDataMovie() {}
	
	public void displayMovieList() {}
}
