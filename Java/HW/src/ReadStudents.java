import java.io.*;
import java.util.Scanner;

public class ReadStudents {
	private static PrintStream replace;

	public static void main(String[] args) {
		if(args.length != 2 && args.length != 1) {
			System.out.println("USAGE: java ReadStudents   입력파일명   [학생이름]");
			System.exit(0);
		}
		String name =  null;
		String number = null;
		String address = null;
		
		if(args.length == 2) name = args[1];
		if(args.length == 2) number = args[1];
		if(args.length == 2) address = args[1];
		String	input_file = args[0];
		
		File in_f = new File(input_file);
		if(!in_f.exists()) {
			System.out.println(input_file+" does not exist");
			System.exit(0);
		}
		
		try {
			RandomAccessFile din = new RandomAccessFile(in_f, "r");
			Student s = new Student();
			Boolean	 found = false;
			int	size=0;
			
			System.out.println("File Size : "+din.length());
			while(true) {
				if((size=s.readStudent(din)) < 0) break;		// if EOF
				if(name == null) {
					System.out.println("["+size+" bytes] "+s);
				
					continue;
				}
				if(s.name.equals(name)) {				// 이름입력
					found = true;
					System.out.println("["+size+" bytes] "+s);
					
				}
				if(s.number.equals(number)) {				// 학번입력
					found = true;
					System.out.println("["+size+" bytes] "+s);
					
				}
				
				if(s.address.equals(address)) {				// 주소
					found = true;
					System.out.println("["+size+" bytes] "+s);
					
				}
				
				if(s.address.equals(number)) {				
					if (!number.trim().equals(number))
                    {
                          replace.println(number);
                          replace.flush();
                    } 
			
				}
				
			}
			if(name != null && !found) System.out.println("No "+name+"'s student exists");
			din.close();
		} catch (IOException err) {
			System.out.println("file I/O error..");
		}
	}
}