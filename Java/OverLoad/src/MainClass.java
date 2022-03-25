
public class MainClass {

	public static void main(String[] args) {
		/* Over Load : 함수 명은같고 매개변수(parameter)의 자료형이나 갯수가 다른 것을 의미한다. */
		method();
		method('A');
		method(10);
		method('B', 10);
		method(10, 'B');
		int sum = sumProc(90,95,100,75,80);
		System.out.println(sum);
		
		sum = sumProc(10,20,30);
		System.out.println(sum);
		
		sumProc("최철", 100, 95 , 75);
	}
	static void method() {
		System.out.println("method()");
	}
	
	static void method(char c) {
		System.out.println("method(char c)");
	}
	
	static void method(int i) {
		System.out.println("method(int i)");
	}
	
	static void method( char c, int i) {
		System.out.println("method(char c ,int i)");
	}
	
	static void method( int i, char c) {
		System.out.println("method(int i, char c)");
	}
	
//	static void method( int i, char ch) {			// 가인수만 다른것
//		System.out.println("method(int i, char c)");
//	}
	
	
//	static int method( int i, char c) {			// 자료형만 다른것
//		System.out.println("method(int i, char c)");
//		return 1;
//	}
	
	static int sumProc(int...num) {
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum+ num[i];
			
		}
		return sum;
	}
	
	static void sumProc(String name, int...num) {
		int sum =0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(name + "님의 합계는 "+sum+"입니다.");
		
	}
	
}
