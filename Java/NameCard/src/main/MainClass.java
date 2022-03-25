package main;

import cls.NameCard;
import cls.PrintNamePhoneCard;
import cls.printNameCard;

public class MainClass {

	public static void main(String[] args) {
		NameCard namecard = new NameCard("홍길동", "123-4567", "zxc8289@naver.com");
		printNameCard pnc = new printNameCard();
		namecard.setPrintNameCard(pnc);
		namecard.print();
		
		PrintNamePhoneCard pnpc = new PrintNamePhoneCard();
		namecard.setPrintNamePhoneCard(pnpc);
		namecard.printPhone();
	}
}
