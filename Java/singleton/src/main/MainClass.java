package main;

import cls.MyClass;
import cls.YouClass;
import cls.heClass;
import singleton.Singleton;

public class MainClass {
	public static void main(String[] args) {
		
		
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		heClass hecls = new heClass();
		
		mycls.method();
		hecls.method();		
		youcls.func();
		
		
		System.out.println(youcls.toString());
		
	
	}
}
	
