package assignment1;

import java.util.Scanner;

public class java042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,phone,address;
		int age;
		double height;
		boolean man;
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		System.out.print("셩별을 입력하세요(true/false) : ");
		man = scan.nextBoolean();
		System.out.print("핸드폰 번호를 입력하세요 : ");
		phone = scan.next();
		System.out.print("키를 입력하세요 : ");
		height = scan.nextDouble();
		System.out.print("주소를 입력하세요 : ");
		address = scan.next();
		System.out.println("이름:"+name+"\n나이:"+age+"\n성별:"+man+"\n번호:"+phone+"\n주소:"+address);
	}

}
