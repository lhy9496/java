package Test240206;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookController {
	List<Book> bookList = new ArrayList<Book>();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		ArrayList scList = new ArrayList();
		for (Book bk : bookList) {
			scList.add(bk);
		}
		return scList;
	}
	
	public ArrayList searchList(String keyword) {
		ArrayList<Book> searchList = new ArrayList();
		for (Book bk : bookList) {
			if (bk.getTitle().contains(keyword)) {
				searchList.add(bk);
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(Book bk : bookList) {
			if (bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {	
				bookList.remove(bk);
				removeBook = bk;
				break;
			}
		}
		return removeBook;
	}
	/*
	 * 문자열.compareTo => 두 문자열이 동일한 경우 : 0
	 * 					 사전적으로 앞서는 문자열이 앞에 나온 경우 : 음수
	 * 					 사전적으로 앞서는 문자열이 뒤에 나온 경우 : 양수
	 */
	public int ascBook() {
		try {
			bookList.sort((obj1, obj2) -> ((Book)obj1).getTitle().compareTo(((Book)obj2).getTitle()));
			return 1;
		} catch (Exception e) {
			return 0;
		}

	}
	
}
