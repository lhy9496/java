package Movie;

public class Movie {
	private String title; // 영화 제목
	private String genre; // 영화 장르
	private int accessAge; // 연령 제한
	private int ticket; // 영화표 수
	
	public Movie() {
	}
	
	public Movie(String title, String genre, int accessAge, int ticket) {
		this.title = title;
		this.genre = genre;
		this.accessAge = accessAge;
		this.ticket = ticket;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		if (accessAge == 0) {
			return "제목 : " + title + " / 장르 : " + genre + " / 연령 제한 : " 
					+ "전체 관람가 / 영화표 : " + ticket + "장";
		} else {
		
			return "제목 : " + title + " / 장르 : " + genre + " / 연령 제한 : " 
					+ accessAge + "세 미만 관람 불가 / 영화표 : " + ticket + "장";
		}
	}
	
	
}
