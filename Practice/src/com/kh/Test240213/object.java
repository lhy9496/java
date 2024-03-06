package com.kh.Test240213;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class object {
	public void objectWrite() {
		
		Human h1 = new Human("A", 1);
		Human h2 = new Human("B", 2);
		Human h3 = new Human("C", 3);
		Human h4 = new Human("D", 4);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Human.txt"))){
			
			oos.writeObject(h1);
			oos.writeObject(h2);
			oos.writeObject(h3);
			oos.writeObject(h4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Human.txt"))){
			while(true) {
				System.out.println(ois.readObject()); 
			}
			
		}catch (EOFException e) {
			System.out.println("파일을 전부 읽어들임");
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
