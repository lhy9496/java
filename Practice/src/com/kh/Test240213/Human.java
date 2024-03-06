package com.kh.Test240213;

import java.io.Serializable;

public class Human implements Serializable{
	private String name;
	private int num;

	public Human(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", num=" + num + "]";
	}
	
	
}
