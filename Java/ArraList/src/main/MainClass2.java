package main;

import java.util.ArrayList;
import java.util.List;

import dto.MyClass;

public class MainClass2 {
	public static void main(String[] args) {
		List<MyClass> list = new ArrayList<MyClass>();
		list.add(new MyClass(1,"최철", 173.2));
		list.add(new MyClass(2,"김인경",156.1));
		list.add(new MyClass(3,"최경",165.1));
		
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
	}

	
	
}
