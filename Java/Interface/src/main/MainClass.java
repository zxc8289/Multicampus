package main;

import cls.MyClass;
import cls.YouClass;
import inter.MyInterface;

public class MainClass {
	public static void main(String[] args) {
	
		//MyInterFace myi = new MyInterFace();
		MyClass mycls = new MyClass();
		mycls.method();
		
		YouClass ycls = new YouClass();
		ycls.func();
		ycls.method();
		
		MyInterface myinterface =new YouClass();
		MyInterface myinterface2 =new MyClass();
	}
}