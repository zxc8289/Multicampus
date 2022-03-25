package assignment1;

public class java05 {

	public static void main(String[] args) {
		/*변수를 하나더 선언해서 바꾸기*/
//		int x,y,z;
//		x = 1;
//		y = 2;
//		
//		z = x;
//		x = y;
//		y = z;
//		System.out.println("x = " + x + "\ny = " + y);
		
		/*계산으로 바꾸기*/
		int x = 1; // x=1
		int y = 2; // x=2
		x = x + y; // x=3 y=2
		y = x - y; // x=3 y=1     
		x = x - y; // x=2 y=1    
		
		System.out.println("x = " + x + "\ny = " + y);
	}

}
