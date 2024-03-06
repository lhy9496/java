package test15;

import java.io.Serializable;

public class Book implements Serializable{
	private static final long serialVersionUID = 0;
	private String title;
	private String Author;
	private int price;
	private String publisher;
	private double discount;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price, String publisher, double discount) {
		super();
		this.title = title;
		Author = author;
		this.price = price;
		this.publisher = publisher;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + Author + ", price=" + price + ", publisher=" + publisher
				+ ", discount=" + discount + "]";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}
