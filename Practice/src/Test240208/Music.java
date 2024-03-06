package Test240208;

import Test240206.Book;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + " - " + title;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public int compareTo(Object o) {
		if (this.hashCode() > o.hashCode()) {
			return 1;
		} else if (this.hashCode() < o.hashCode()){ 
			return -1;
		} else {
			return 0;
		}
	}
	
}
