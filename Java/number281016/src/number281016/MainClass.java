package number281016;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Menu >>> ");
		System.out.println("1. 10진수 -> 2진수로 변경");
		System.out.println("2. 10진수 -> 8진수로 변경");
		System.out.println("3. 10진수 -> 16진수로 변경");
		System.out.println("4. 2진수 -> 10진수로 변경");
		System.out.println("5. 8진수 -> 10진수로 변경");
		System.out.println("6. 16진수 -> 10진수로 변경");
		System.out.print("원하시는 처리 번호를 입력해 주세요 : ");
		int work = scan.nextInt();
		System.out.print("변경하고 싶은 숫자를 입력해 주세요 : ");
		int number = scan.nextInt();
		
		
		switch (work) {
		case 1:
			String num1 = conversion(number,work);
			System.out.println(num1);
			break;
			
		case 2:
			String num2 = conversion(number,work);
			System.out.println(num2);
			break;
		
		case 3:
			String num3 = conversion(number,work);
			System.out.println(num3);
			break;
		
		case 4:
			String num = String.valueOf(number);
			int num4 = coversion2(num,work);
			System.out.println(num4);
			break;
		
		case 5:
			String num5 = conversion(number,work);
			System.out.println(num5);
			break;
			
		case 6:
			String num6 = conversion(number,work);
			System.out.println(num6);
			break;
			
		default:
			break;
		}
	}
	
	static String conversion(int number, int work) {
		String cString = null;
		if(work == 1) {cString = Integer.toBinaryString(number);}
		else if(work == 2) {cString = Integer.toOctalString(number);}
		else if(work == 3) {cString = Integer.toHexString(number);}
		return cString;
	}
	
	static int coversion2(String num, int work) {
		int cInt = 0;
		if(work==4){cInt = Integer.parseInt(num, 2);}
		return cInt;
		
	}
	
}
