
public class Book {
	private String title;
	private String genre;
	private String author;
	private int number;
	
	public Book(String title, String genre, String author, int number) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.number = number;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return  "[title = " + title + " genre = " + genre + 
				" author = " + author + " number = " + number + "]";
	}
}
