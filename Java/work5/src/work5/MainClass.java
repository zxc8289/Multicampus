package work5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
		// static char ascToChar(int asc)
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int str = sc.nextInt();
		char a = ascToChar(str);
		System.out.println("문자 변환 : " + a);
		
		
		// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫과 나머지를 구한다.
		int num1,num2,num3;
		int tag[] = new int[1];
		System.out.print("첫 번째 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 : ");
		num2 = sc.nextInt();
		num3 = division(num1, num2, tag);
		System.out.println("몫 : " + num3 + " / 나머지 : " + tag[0]);
		
		
		
		// 두점 사이의 거리를 구하는 함수를 작성하라. 
		// static double distance(double x1, double y1, double x2, double y2)
		// 	root (y2 - y1)2승 + (x2 - x1)2승
		int dot1,dot2,dot3,dot4;
		double sum;
		System.out.print("첫 번째 점 입력 : ");
		dot1 = sc.nextInt();
		System.out.print("두 번째 점 입력 : ");
		dot2 = sc.nextInt();
		System.out.print("세 번째 점 입력 : ");
		dot3 = sc.nextInt();
		System.out.print("네 번째 점 입력 : ");
		dot4 = sc.nextInt();
		sum = getDistance(dot1, dot2,dot3, dot4);
		System.out.println(sum);
		
		// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
		// static boolean isDouble(String snumber)
		System.out.print("숫자 입력 : ");
		String strNum = sc.next();
		boolean ft = false;
		ft = isDouble(strNum);
		if(ft==false) {
		System.out.println("정수입니다.");
		}
		else if(ft==true) {
		System.out.println("실수입니다.");
		}
		
		// 2차원 배열을 1차원 배열로 변경해서 리턴하는 함수를 작성하라.
		// static int[] array2toArray1(int array[][])
		int array2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int array1[] = array2toArray1(array2);
		System.out.println(Arrays.toString(array1));
		
	}
	
	static char ascToChar(int asc) {
		char cs = (char)asc;
		return cs;
	}
	
	static int division(int a,int b, int tag[]) {
		int share = a / b;
		tag[0] = a % b;
		return share;
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		double d;
		int xd, yd;
		yd = (int) Math.pow((y1-y),2);
		xd = (int) Math.pow((x1-x),2);
		d = Math.sqrt(yd+xd);
		return d;
	}
	
	static boolean isDouble(String snumber) {
		boolean floatTrue= false;
		for(int i=0; i<snumber.length(); i++) {
			char c = snumber.charAt(i);
			if(c == '.') {
				floatTrue = true;
				break;
			}
		}
		return floatTrue;
	}
	
	static int[] array2toArray1(int array2[][]) {
		int array1[] = new int [array2.length * array2[0].length];
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				array1[array2[i].length * i + j ] = array2[i][j];
			}
		}
		return array1;
	}
	
}
