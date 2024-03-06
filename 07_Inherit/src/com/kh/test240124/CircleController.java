package com.kh.test240124;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double area = radius * radius * Math.PI;
		return c.toString() + " / " + area;
	}
	
	public String calCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double circum = radius * 2 * Math.PI;
		return c.toString() + " / " + circum;
	}
}
