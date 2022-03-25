package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDto;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);
	private ArrayList<StudentDto> arrList = new ArrayList<StudentDto>();
	private int count;

	public StudentDao() {
		count = 0;
	}

	public void insert() { // 추가
		System.out.print("번호 : ");
		int number = sc.nextInt();

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("신장 : ");
		double height = sc.nextDouble();

		System.out.print("엉어 : ");
		int eng = sc.nextInt();

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		arrList.add(new StudentDto(number, name, height, eng, kor, math));
		count++;
	}

	public void delete() { // 삭제
		System.out.print("삭제할 학생정보의 이름을 입력하세요 : ");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i < count; i++) {
			StudentDto dto = arrList.get(i);
			if (dto.getName().equals(name)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("삭제할 데이터가아닙니다.");
		}
		else {
			StudentDto dto = arrList.remove(index);
			System.out.println(dto +"삭제가 완료되었습니다.");
		}
	}


	public void select() { // 검색
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		int index = -1;
		for (int i = 0; i < count; i++) {
			StudentDto dto = arrList.get(i);
				if (dto.getName().equals(name)) {
					index = i;
					break;
				}
		}
		if (index == -1) {
			System.out.println("데이터를 찾을 수 없습니다.");
		} else {
			StudentDto dto = arrList.get(index);
			System.out.println(dto.toString());
		}
	}

	public void update() { // 수정
		System.out.print("수정할 학생정보의 이름을 입력하세요 : ");
		int index = -1;
		String name = sc.next();
		for (int i = 0; i < count; i++) {
			StudentDto dto = arrList.get(i);
			if (dto.getName().equals(name)) {
				System.out.print("번호 : ");
				int number = sc.nextInt();

				System.out.print("이름 : ");
				String name2 = sc.next();

				System.out.print("신장 : ");
				double height = sc.nextDouble();

				System.out.print("엉어 : ");
				int eng = sc.nextInt();

				System.out.print("국어 : ");
				int kor = sc.nextInt();

				System.out.print("수학 : ");
				int math = sc.nextInt();
 
				dto.setNumber(number);
				dto.setName(name2);
				dto.setHeight(height);
				dto.setEng(eng);
				dto.setKor(kor);
				dto.setMath(math);
				
			
			}
		}
	}

	public void alldata() { // 조회
		for (int i = 0; i < count; i++) {
			System.out.println(arrList.get(i));
		}
	}
}
