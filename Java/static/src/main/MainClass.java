package main;

import cls.MyClass;
import cls.YouClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		    static : 정적 <=> 동적(dynamic)
		    
		    variable
		    method
		 */
		MyClass cls = new MyClass();
		cls.func();
		cls.func();
		cls.func();
		
		MyClass mycls = new MyClass();
		mycls.func();
		mycls.func();
		
		MyClass.staticnumber = 14;
		
		// 메소드
		YouClass yc = new YouClass();
		yc.memberMethod();	// 멤버메소드, 인스턴스메소드
		
		YouClass.staticMethod(); // 스태틱메소드 호출방법 
		YouClass.swap(2, 3);
		
	}

}
