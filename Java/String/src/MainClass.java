import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 변수의 문자가 숫자로만 되어 있는지 아니면 다른 문자인지를 판별하는 코드 */
//		char c = 'A';
//		char tmp;
//		
//		boolean output = true;
//		// 숫자입니다.
//		if(Character.isDigit(c) == true) {
//			System.out.println("숫자가 입니다.");
//		}
//		// 숫자가 아닙니다.
//		else {
//			System.out.println("숫자가 아닙니다.");
//		}
//		
//		// 문자열 입력
//		System.out.print("판별할 문자열을 입력하세요 : ");
//		String input = scan.nextLine();
//		
//		for(int i=0; i < input.length(); i++) { 
//			tmp = input.charAt(i); 	// 한글자씩검사
//			
//			if(Character.isDigit(tmp) == false) {  // 문자열이 숫자가 아닐경우
//				output = false;					// output의 값 false로 변경
//			}
//		}
//		
//		System.out.println("모두 숫자 : " + output);
//		
		
		String en;
		
		System.out.print("영어를 입력하세요(소문자) : ");
		en = scan.next();
		en = en.toUpperCase();
		System.out.println(en);
		
	}
}
