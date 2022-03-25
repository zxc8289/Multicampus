import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	public static void main(String[] args) {
		
		File file = new File("c:\\myFile\\writeData.txt");
		
		try {
			// 쓰기
//			FileWriter fw = new FileWriter(file);
//			fw.write("안녕하세요\n");
//			fw.write("곤니찌와");
//			fw.close();
			
			// 추가쓰기
//			FileWriter fw = new FileWriter(file, true);
//			fw.write("반갑습니다.");
//			fw.close();
			
			// 문장쓰기
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("안녕하세요");
			pw.println("곤니찌와");
			pw.println("hello");
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
