import java.io.*;
import java.util.Scanner;

public class Student  {
	public 		String 	number; // 학번
	public		String	name; // 이름
	public 		char	gender; // 성별
	public		String	phone_no;  // 핸드폰 번호
	public 		String 	address; // 주소
	
	public void getStudent (Scanner in) {
		number = in.next();
		name = in.next();
		gender = in.next().charAt(0);
		phone_no = in.next();
		address = in.next();
		
		in.nextLine(); // 줄바꿈
	}
	
	public void printStudent() {
		System.out.println("["+number+"] "+name+"("+((gender == 'm') ? "남":"여")+") 전화번호: "+phone_no+", 주소: "+address);
	}
	
	public	void writeStudent(RandomAccessFile dout) {
		try {
			byte[] bytes = toString().getBytes("utf-8"); // byte 배열로 변환
			
			System.out.print("["+dout.getFilePointer()+", "+bytes.length+"] ");
			printStudent();
			dout.writeInt(bytes.length);
			dout.write(bytes);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported charset");
		} catch (IOException e) {
			System.out.println("file error ...");
		}
	}
	
	public int	readStudent(RandomAccessFile in_f) {
		int size = -1;
		try {
 
	  	 	if(in_f.length() == in_f.getFilePointer())	 	// if EOF
	  				return -1;

			size = in_f.readInt();
			byte[] bytes = new byte[size];
			in_f.read(bytes);
			String str = new String(bytes,"utf-8");
			Scanner buffer = new Scanner(str);
			buffer.useDelimiter("\\|");
			getStudent(buffer);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Char-set");
		} catch(IOException e) {
			System.out.println("IOException occurred");
		}
		return size;
	}
	public String toString() {
		
		return number+"|"+name+"|"+gender+"|"+phone_no+"|"+address+"|";
	}
}

