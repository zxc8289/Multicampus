package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {
	private ArrayList<AccountDto> AL = new ArrayList<AccountDto>();
	Scanner sc = new Scanner(System.in);
	File file = new File("c:\\myFile\\Abook.txt");
	// list 가계부 불러오기
	public void Read() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while((str = br.readLine()) != null) {		// null?? 스트링값
				System.out.println(str);
			}
			br.close();			// 읽은다음 닫기
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/* CRUD 생성,읽기,갱신,삭제 */
	// 어레이리스트 생성

	public AccountDao() {
		AL.add(new AccountDto("0000/00/00", "테스트", "1000", 10000, "테스트"));
		AL.add(new AccountDto("1111/01/00", "테스트2", "2000", 11111, "테스트용2"));
		AL.add(new AccountDto("2222/02/01", "테스트3", "3000", 33333, "테스트용3"));
		AL.add(new AccountDto("1111/00/00", "테스트2", "2000", 11111, "테스트용2"));
	}
	
	// 리스트 생성
	public void create() { // 리스트 생성함수
		System.out.print("년/월/일(0000/00/00) : ");
		String dateTime = sc.next();

		System.out.print("용도 간단기입:");
		String use = sc.next();

		System.out.print("수입/지출:");
		String classify = sc.next();

		System.out.print("금액:");
		int money = sc.nextInt();

		System.out.print("내용:");
		String memo = sc.next();

		AL.add(new AccountDto(dateTime, use, classify, money, memo)); // 어레이리스트에 입력한 값 저장
	}

	// 읽기
	public void read() {
		System.out.print("읽어올 가계부 날짜를 입력해주세요(0000/00/00):");
		String dateTime = sc.next();
		int index = -1;
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			if (dto.getDateTime().equals(dateTime)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다.");
		} else {
			AccountDto dto = AL.get(index);
			System.out.println("----------------");
			System.out.println("날짜 - " + dto.getDateTime());
			System.out.println("----------------");
			System.out.println(dto.getUse());
			System.out.println(dto.getClassify());
			System.out.println(dto.getMoney());
			System.out.println(dto.getMemo());
		}

	}

	// 갱신

	public void update() {
		System.out.print("수정할 가계부 날짜를 입력해주세요(0000/00/00):");
		String dateTime = sc.next();
		int index = -1;
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			if (dto.getDateTime().equals(dateTime)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("수정할 데이터를 찾을 수 없습니다.");
		} else {
			AccountDto dto = AL.get(index);
			System.out.println("수정할 가계부 데이터들을 입력해주세요.");
			System.out.print("년/월/일:");
			String dateTime1 = sc.next();
			System.out.print("용도:");
			String use = sc.next();
			System.out.print("수입/지출:");
			String classify = sc.next();
			System.out.print("금액:");
			int money = sc.nextInt();
			System.out.print("내용:");
			String memo = sc.next();
			System.out.println("수정이 완료되었습니다.");
			dto.setDateTime(dateTime1);
			dto.setUse(use);
			dto.setClassify(classify);
			dto.setMoney(money);
			dto.setMemo(memo);
		}
	}

	// 삭제
	public void delete() {
		System.out.print("삭제할 가계부 날짜를 입력해주세요(0000/00/00):");
		String deteTime = sc.next();
		int index = -1;
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			if (dto.getDateTime().equals(deteTime)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("삭제할 데이터를 찾을 수 없습니다..");
		} else {
			AccountDto dto = AL.remove(index);
			System.out.println(dto + "삭제가 완료되었습니다.");
		}
	}

	// all data print 모든데이터 출력
	public void allDate() {
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			System.out.println("----------------");
			System.out.println("날짜 - " + dto.getDateTime());
			System.out.println("----------------");
			System.out.println(dto.getUse());
			System.out.println(dto.getClassify());
			System.out.println(dto.getMoney());
			System.out.println(dto.getMemo());
			System.out.println();
		}
	}

	// select
	// 입력한 달의 데이트 모두 출력 =>
	public void select() {
		System.out.print("출력할 데이터의 달을 입력해주세요(00):");
		String month = sc.next();
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			String array[] = dto.getDateTime().split("/");
			if (array[1].equals(month)) {
				System.out.println("----------------");
				System.out.println("날짜 - " + dto.getDateTime());
				System.out.println("----------------");
				System.out.println(dto.getUse());
				System.out.println(dto.getClassify());
				System.out.println(dto.getMoney());
				System.out.println(dto.getMemo());
				System.out.println();
			} else {
				System.out.println("데이터를 찾을 수 없습니다.");
				break;
			}
		}
	}

	// 내용 검색어로 산출된 데이터만을 출력
	public void select2() {
		System.out.print("검색하고 싶은 내용을 입력해주세요:");
		String text = sc.next();
		int index = -1;
		for (int i = 0; i < AL.size(); i++) {
			AccountDto dto = AL.get(i);
			if (dto.getMemo().equals(text)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다.");
		} else {
			AccountDto dto = AL.get(index);
			System.out.println("----------------");
			System.out.println("날짜 - " + dto.getDateTime());
			System.out.println("----------------");
			System.out.println(dto.getUse());
			System.out.println(dto.getClassify());
			System.out.println(dto.getMoney());
			System.out.println(dto.getMemo());
		}
	}

	// ---------------------------

	// 파일저장/불러오기
	public void save() {
		try {
			// 문장쓰기
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(AL);
			System.out.println("파일이 저장되었습니다.");
			pw.close();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
