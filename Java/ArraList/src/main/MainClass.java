package main;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/*
		   Collection : 수집
		   
		   List : 목록
		   			ArrayList
		   			 배열처럼 사용할 수 있는 목록
		   			 선형구조
		   			 검색속도빠름
		   			 index로 접근한다.
		   			 
		   			LinkedList
		   			 추가/삭제의 속도가 우수하다.
		 */
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//List<Integer> arrList = new ArrayList<Integer>();
		// 추가
		arrList.add(111);
		
		Integer in = new Integer(222);
		arrList.add(in);
		
		arrList.add(new Integer(333));
		
		int len = arrList.size();
		System.out.println("list의 크기:" + len);
		
		System.out.println(arrList.get(0));
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		// 원하는 위치에 추가
		arrList.add(1, 200);		// 배열의 1번지에 200을 추가
		
		for (int i = 0; i <  arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		// 삭제
		Integer num = arrList.remove(2);	// 배열의 2번지 삭제하고 삭제된 데이터 num에 반환
		System.out.println("삭제된 데이터:"+num);
		for (Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println("list의 크기:"+ arrList.size());
		// 검색
		int index = arrList.indexOf(333);
		System.out.println(index+"번지");
		
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if(val == 200) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		// 수정
		Integer newVal = 100;
		arrList.set(0, newVal);		// 0번지에 100으로 수정
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		
		// ArrayList<String> slist
		// 추가
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("안녕");
		slist.add(" ㅋㅋ ");
		slist.add("하세요.");
		for (int i = 0; i < slist.size(); i++) {
			System.out.print(slist.get(i));
		}
		
		// 삭제
		String s = slist.remove(1);		// 1번지  ㅋㅋ 삭제
		System.out.println("반환된 문자열" + s);
		for (int i = 0; i < slist.size(); i++) {
			System.out.print(slist.get(i));
		}
		
		// 검색
		int a = slist.indexOf("안녕");
		System.out.println(a);
		
		int b = slist.indexOf("하세요.");
		System.out.println(b);
		
		// 수정
		String new1 = "키킼";
		slist.set(0, new1);
		for (int i = 0; i < slist.size(); i++) {
			System.out.print(slist.get(i));
		}
		
		
	}
}
