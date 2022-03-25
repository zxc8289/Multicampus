import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int payment,possession,sum;
		System.out.print("상품가격을 입력하세요 : ");
		possession = scan.nextInt();
		System.out.print("지불금액을 입력하세요 : ");
		payment = scan.nextInt();
		sum = payment-possession;
		System.out.println("잔액 : " + sum + "\n5000원 : "+ sum/5000 + "\n1000원 : "+sum%5000/1000 + "\n500원 : " + sum%5000%1000/500 + "\n100원 : " + sum%5000%1000%500/100 + "\n50원 : "+ sum%5000%1000%500%100/50 + "\n10원 : "+ sum%5000%1000%500%100%50/10);
	}
}
