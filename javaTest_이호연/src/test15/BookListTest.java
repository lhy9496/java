package test15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);
		
		test5.saveFile(list);
		
		List<Book> booksList = test5.loadFile();
		
		test5.printList(booksList);
		}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list) {
		try (ObjectOutputStream oout = new ObjectOutputStream(new DataOutputStream(new FileOutputStream("book.dat")))){
			for (Book bk : list) {
				oout.writeObject(bk);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Book> loadFile(){
		List<Book> booksList = new ArrayList<Book>();
		try (ObjectInputStream oin = new ObjectInputStream(new DataInputStream(new FileInputStream("book.dat")))) {
			while(true) {
			Book bk = (Book)oin.readObject();
			booksList.add(bk);
			}
		} catch (EOFException e) {
			System.out.print("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return booksList;
	}
	
	public void printList(List<Book> list) {
		for (Book bk : list) {
			System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getPublisher() + ", "
								+ bk.getPrice() + "원, " + (int)(bk.getDiscount() * 100) + "% 할인");
			System.out.println("할인된 가격 : " + (int)(bk.getPrice()*(1 - bk.getDiscount())) + "원");
		}
	}
}
