import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.print("1~3을 입력하세요 : ");
		number = scan.nextInt();
		
		switch(number) {
			case 1:
				System.out.println("number는 1입니다.");
				break;
			case 2:
				System.out.println("number는 2입니다.");
				break;
			case 3:
				System.out.println("number는 3입니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
		}
		
	}

}
