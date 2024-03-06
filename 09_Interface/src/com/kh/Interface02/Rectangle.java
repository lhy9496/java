package com.kh.Interface02;

public class Rectangle implements Shape{
	private double height;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return this.height * this.width;	
	}
	
	
}
