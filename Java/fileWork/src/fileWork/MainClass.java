package fileWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ioput();
		ioput2();
	}
		// 함수화
		static void ioput() {
			File file = new File("c:\\myFile\\work.txt");
			Scanner sc = new Scanner(System.in);
			// String data 3개 저장
			try {
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);

				String data[] = new String[3];
				for (int i = 0; i < data.length; i++) {
					System.out.print("문자를 입력해주세요 : ");
					data[i] = sc.next();
					pw.print(data[i] + "\n");
				}
				pw.close(); // pw 닫기

				// String data 3개 불러오기 -> 배열저장
				BufferedReader br = new BufferedReader(new FileReader(file)); // file 읽어오기
				int count=0;
				String str;
				while ((str = br.readLine()) != null) {
					count++;
				}
				data = new String[count];
				int n = 0;
				br = new BufferedReader(new FileReader(file));
				
				while ((str = br.readLine()) != null) {
					data[n] = str;
					n++;
				}
				System.out.println(Arrays.toString(data));
				
				
				br.close(); // br 닫기

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		static void ioput2() {
			File file2 = new File("c:\\myFile\\work2.txt");
			try {
				String human[] = { "홍길동", "24", "서울시" };
				FileWriter fw2 = new FileWriter(file2);
				BufferedWriter bw2 = new BufferedWriter(fw2);
				PrintWriter pw2 = new PrintWriter(bw2);
				
				pw2.print(Arrays.toString(human));
				pw2.close();
				
				// 파일에서 불러오기 -> 배열 [0] -> 이름 [1] -> 나이 [2] -> 주소
				BufferedReader br2 = new BufferedReader(new FileReader(file2)); // file 읽어오기
				String str2;
				String mem = null;
				while ((str2 = br2.readLine()) != null) {
					mem =str2;	
				}
				br2.close(); // br 닫기
				System.out.println(mem);
				
			} catch (
			IOException e) {
				e.printStackTrace();
			}
		}
}
