package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	final == const define
		 	
		 	variable
		 	class
		 	method
		 	
		*/
		
		final int NUMBER = 10; // 변수 -> 상수(지정된 수, 변할 수 없는 수)
							   // 대입하는용
							   // 변수와 헷갈리기때문에 대문자료 표기하는 경우가 많음
		final int number = 10;
		int num = number;
		int num1 = NUMBER;
		
		if(num > 0 && num < num1) {		// 비교용으로는 사용가능
			
		}
		
	}

}

/*final*/ class Parent{				// final이 추가되면 상속금지
	public /*final*/ void method() {	// final이 추가되면 Over Ride 금지
		
	}
}

class Child extends Parent{
	
	public void method() {	// Over Ride 금지
		
	}
	
}