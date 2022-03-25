package assignment1;

public class java04 {

	public static void main(String[] args) {
		
		String name1="홍길동",name2="일지매",name3="장옥정",
			   phone1="010-111-2222", phone2="02-123-4567", phone3="02-345-7890",
			   address1="경기도", address2="서울", address3="부산";
		int age1=20, age2=18, age3=14;
		boolean man1=true, man2=true, man3=false;
		double height1=175.12, height2=180.01, height3=155.78;
		
		System.out.println("=================================================================");
		System.out.println("\\  name\t\tage\tman\tphone\t\theight\taddress\t\\");
		System.out.println("=================================================================");
		System.out.println("\\ \""+name1+"\"\t"+age1+"\t"+man1+"\t"+phone1+"\t"+height1+"\t\""+address1+"\"\t\\");
		System.out.println("\\ \""+name2+"\"\t"+age2+"\t"+man2+"\t"+phone1+"\t"+height2+"\t\""+address2+"\"\t\\");
		System.out.println("\\ \""+name3+"\"\t"+age3+"\t"+man3+"\t"+phone1+"\t"+height3+"\t\""+address3+"\"\t\\");
		System.out.println("=================================================================");

	}
}
