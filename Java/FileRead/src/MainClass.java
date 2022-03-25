import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		File file = new File("c:\\myFile\\newfile.txt");

		// 파일 읽기
		try {
			// 한글자씩 읽기
//			FileReader fr = new FileReader(file);
//			int ch = fr.read();
//			
//			while(ch != -1) {		// 한글자씩 읽고 -1이될때 데이터가없기때문에 조건문 탈출
//				System.out.println((char)ch);
//				ch = fr.read();
//			}
//			fr.close();
			
			// 문장으로 읽기
			BufferedReader br = new BufferedReader(new FileReader(file)); // file 읽어오기
			
			String str;		
			while((str = br.readLine()) != null) {		// null?? 스트링값
				System.out.println(str);
			}
			br.close();			// 읽은다음 닫기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

