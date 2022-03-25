package main;

import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		String Member[][] = {
				{"홍길동", "24", "010-4428-8766", "서울시", "동창"},
				{"성춘향", "19", "010-6148-3566", "부산시", "기로꾸"},
				{"홍길동", "19", "010-9154-2661", "울산시", "기기"}
		};
		
		// 종리를 3장 준비
		MemberDto member[] = new MemberDto[3];
		
		// 기입할 수 있도록 준비
		for (int i = 0; i < member.length; i++) {
			member[i] = new MemberDto();
		}
		
		//추가
		member[0].setName("홍길동");
		member[0].setAge(24);
		member[0].setPhone("010-9999");
		member[0].setAddress("붓산");
		member[0].setContent("동창");
		
		System.out.println(member[0].getName());
		System.out.println(member[0].getAge());
		System.out.println(member[0].getPhone());
		System.out.println(member[0].getAddress());
		System.out.println(member[0].getContent());
	}

}
