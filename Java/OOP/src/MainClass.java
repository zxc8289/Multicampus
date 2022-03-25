
public class MainClass {
	public static void main(String[] args) {
			/*
			   구조, 관리
			   Object Oriented Programming
			   객체	  지향
			   
			   1. 은닉성(캡슐화)
			   2. 상속성
			   3. 다형성
			   
			   형식:
			   	class 클래스명{
			   		variable
			   		method
			   	}
			   
			   흐름 -> 절차지향
			 */
		
			 // class, array -> allocation(동적할당)
			 MyClass cls = new MyClass();
			 // 자료형 클래스의 변수 == 객체
			 //instance(주체)
			 cls.number = 1;
			 cls.name = "홀길동";
			 cls.method();
			 
			 MyClass cls1 = new MyClass();
			 cls1.number = 2;
			 cls1.name = "성춘향";
			 cls1.method();
			 
			 TV tv1 = new TV();
			 tv1.isPowerOn = true;
			 tv1.channel = 23;
			 tv1.volume = 10;
			 tv1.maker = "SK";
			 tv1.method();
			 
			 
			 /*
			 TV tv2 = new TV();
			 tv2.isPowerOn = false;
			 tv2.channel = 50;
			 tv2.volume =0;
			 tv2.method();
			 */
			 
			 TV tvArr[] = new TV[2];	// 객체 생성이 아닙니다.
			 for (int i = 0;  i< tvArr.length; i++) {
				tvArr[i] = new TV();	// 객체 생성
			}
			 
			 tvArr[0].isPowerOn = true;
			 tvArr[0].channel = 23;
			 tvArr[0].volume = 10;
			 tvArr[0].maker = "SamSung";
			 
			 tvArr[1].isPowerOn = true;
			 tvArr[1].channel = 50;
			 tvArr[1].volume = 0;
			 tvArr[1].maker = "LG";
			 
			 for (int i = 0; i < tvArr.length; i++) {
				tvArr[i].method();
			}
	}
}

class TV{
	 boolean isPowerOn;
	 int channel;
	 int volume;
	 String maker;
	 
	 void method() {
		 System.out.println("TV의 회사는 "+maker+ " 상태는 "+isPowerOn+" 이고 채널:"+channel+"번을 보고 있으며 "+volume+"볼륨입니다.");
	 }
}


class MyClass{
	int number;
	String name;
	
	void method() {
		System.out.println("MyClass method()");
	}
}