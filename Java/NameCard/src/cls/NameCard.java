package cls;

public class NameCard {
	String name;
	String phone;
	String email;
	
	printNameCard pNameCard;
	
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(printNameCard p) {
		pNameCard = p;
	}
	
	public void print() {
		pNameCard.print(this);
	}
	
	PrintNamePhoneCard pNamePhoneCard;
	
	public void setPrintNamePhoneCard(PrintNamePhoneCard p) {
		pNamePhoneCard = p;
	}
	
	public void printPhone() {
		pNamePhoneCard.print(this);
	}
}
