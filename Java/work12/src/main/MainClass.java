package main;

import cls.Circle;
import cls.Rectangle;

public class MainClass {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		System.out.println(c.calcArea());
		
		Rectangle rect = new Rectangle(3, 5);
		System.out.println(rect.calcArea());
	}
}
