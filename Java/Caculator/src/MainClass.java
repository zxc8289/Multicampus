import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/* 계산기 */
		Scanner scan = new Scanner(System.in);
		String numStr1, numStr2;
		
		double num1,num2,sum=0;
		String Operator;
		
		/* 1.입력 */
		
		while(true) {
			System.out.print("1번째 숫자를 입력하세요 : ");
			numStr1 = scan.next();
			boolean ok = true;
			for(int i =0; i<numStr1.length(); i++) {
				int n = numStr1.charAt(i);
				if(n < 48 || n > 57) {  
					ok = false;
					break;
				}
			}
			if(ok == false) {
				continue;
			}
			break;
		}
		
		while(true) {
			System.out.print("연산자를 입력하세요(+,-,*,/): ");
			Operator = scan.next();
			if(Operator.equals("+") || Operator.equals("-") || Operator.equals("*") || Operator.equals("/")) {
				break;
			}
		}
		
		while(true) {
			System.out.print("2번째 숫자를 입력하세요 : ");
			numStr2 = scan.next();
			boolean ok = true;
			for(int i =0; i<numStr2.length(); i++) {
				int n = numStr2.charAt(i);
				if(n < 48 || n > 57) {  
					ok = false;
					break;
				}
			}
			if(ok == false) {
				continue;
			}
			break;
		}
		
		num1 = Integer.parseInt(numStr1);
		num2 = Integer.parseInt(numStr2);
		
		/* 2. 연산 */
		switch(Operator){
			case "+":
				sum=num1+num2;
				break;
			
			case "-":
				sum=num1-num2;
				break;
			
			case "*": 
				sum=num1*num2;
				break;
			
			case "/":
				sum=num1/num2;
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
		/* 3. 결과 출력 */
		System.out.println("연산 값 : " + sum + "입니다.");
	}
}
