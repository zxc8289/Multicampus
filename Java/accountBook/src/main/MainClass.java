package main;

import java.util.Scanner;

import dao.AccountDao;

public class MainClass {

	public static void main(String[] args) {
		// 메뉴
		Scanner sc = new Scanner(System.in);
		AccountDao accountDao = new AccountDao();
		
		while(true) {
			System.out.println("1. 가계부 불러오기");
			System.out.println("2. 가계부 생성");
			System.out.println("3. 가계부 검색");
			System.out.println("4. 가계부 수정");
			System.out.println("5. 가계부 삭제");
			System.out.println("6. 가계부 모두 출력");
			System.out.println("7. 입력한 달의 데이터 모두 출력");
			System.out.println("8. 관련된 내용 검색");
			System.out.println("9. 파일 저장");
			System.out.print("메뉴 번호를 입력 >> ");
			int num = sc.nextInt();
			
			if(num==1) {
				accountDao.Read();
			}
			else if(num==2) {
				accountDao.create();
			}
			else if(num==3) {
				accountDao.read();
			}
			else if(num==4) {
				accountDao.update();
			}
			else if(num==5) {
				accountDao.delete();
			}
			else if(num==6) {
				accountDao.allDate();
			}
			else if(num==7) {
				accountDao.select();
			}
			else if(num==8) {
				accountDao.select2();
			}
			else if(num==9) {
				accountDao.save();
			}
		}
		
		// 

	}

}
