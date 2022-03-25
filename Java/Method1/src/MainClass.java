import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
	int i = functionName('A');  // 'A' 들어가는값 파라미터, i 나오는값
	System.out.println(i);
	
	String st ="abcDEF";
	String upst = toUpperCase(st);  // 1. st의값을 String str에 삽입 후 4. upst에 s값 반환
	System.out.println(upst);  		// 5. upst값 출력
	
	functionName1();
	
	functionName2(4,0);	// 4,2를 double d, int n에 각각 삽입
	
	
	int array[] = {11,22,33};
	int arrAlias[]; // 배열 복사
	arrAlias = array;	// 주소 복사;
	arrAlias[1] = 27;
	System.out.println(arrAlias[1]);
	System.out.println(array[1]);
	
	int arrayNum[] = { 1, 2, 3, 4, 5 };
	funtionName5(arrayNum);
	System.out.println(Arrays.toString(arrayNum));
	}
	
	// 주소를 할당
	static void funtionName5(int array[]) {
		for(int i=0; i<array.length; i++) {
			array[i] = array[i] * 2;
			
		}
		
	}
	
//	static int[] funtionName5(int array[]) {		// void안쓰고 배열
//		for(int i=0; i<array.length; i++) {
//			array[i] = array[i] * 2;
//			
//		}
//		return array;
//	}
	
	static void functionName4(int a1,int a2,int a3,int a4,int a5) {
		a1 = a1 * 2;
		a2 = a2 * 2;
		a3 = a3 * 2;
		a4 = a4 * 2;
		a5 = a5 * 2;
	}
	
	static int functionName(char c){
		System.out.println("functionName(char c) 호출");
		
		return 1;
	}
	
	static String toUpperCase(String str) {  // 2. 함수식 진행
		String s = "";
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i);
			if(n >= 97) {
				n = n-32;
			}
			s = s+ (char)n;
		}
		return s;		// 3. 계산한 값 s를 반환
	}
	
	static void functionName1() {
		System.out.println("functionName1() 호출");
	}
	
	static void functionName2(double d, int n) {	// void형은 return값이 없어도 상관없음, 4,2 삽입
		double result;
		
		if(n ==0 ) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		result = d/n;								// 계산식
		System.out.println("결과값은 : " + result);
	}
}
