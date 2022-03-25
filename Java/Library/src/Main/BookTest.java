package Main;

import java.util.ArrayList;

import Book.Book;
import Book.Magazine;

public class BookTest {

	public static void main(String[] args) {
		Book[] B = new Book[5];
		B[0] = new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		B[1] = new Book("33455", "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		B[2] = new Book("55355", "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		B[3] = new Book("35332", "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		B[4] = new Book("35355", "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		
		Magazine[] M = new Magazine[5];
		M[0] = new Magazine("35535", "Java World", "편집부", "Jaen.kr", 2013, 2,  7000, "");
		M[1] = new Magazine("33434", "Mobile World", "편집부", "Jaen.kr", 2013, 8,  8000, "");
		M[2] = new Magazine("75342", "Next Web", "편집부", "Jaen.kr", 2012, 10,  10000, "AJAX 소개");
		M[3] = new Magazine("76543", "Architecture", "편집부", "Jaen.kr", 2010, 3,  5000, "java 시스템");
		M[4] = new Magazine("76534", "Dta Modeling", "편집부", "Jaen.kr", 2012, 12,  14000, "");
		
		System.out.println("*********************** 도서목록 **************************");
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i].toString());
		}
		

		System.out.println("\n*********************** 잡지 목록 **************************");
		for(int i=0; i<M.length; i++) {
			System.out.println(M[i].toString());
		}

	}
}

