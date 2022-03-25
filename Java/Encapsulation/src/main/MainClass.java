package main;

import mycls.MyClass;

public class MainClass {

	public static void main(String[] args) {
		MyClass cls = new MyClass();
		
		
		cls.name = "최철";
//		cls.height = 2;
		
		cls.setNumber(123);
		
		int num = cls.getNumber();
		System.out.println(num);
	}
}
