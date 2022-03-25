package cls;

import inter.MyInterface;
import inter.YouInterface;

public class YouClass implements MyInterface, YouInterface{
	
	public void func() {
		System.out.println("YouClass func()");
		
	}
	
	public void method() {
		System.out.println("method");
	}

}
