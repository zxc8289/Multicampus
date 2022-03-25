package cls;

import inter.PrintNameInterface;

public class NameCard {
	String name;
	String phone;
	String email;
	
	PrintNameInterface printInterface;
	
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	
	public void setPrintCard(PrintNameInterface p) {
		printInterface  = p;
	}
	
	public void print() {
		printInterface.print(this);
	}
}
