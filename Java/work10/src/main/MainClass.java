package main;

import movie.Movie;
import movie.MovieWork;

public class MainClass {

	public static void main(String[] args) {
		Movie mv = new Movie("스파이더맨", 7, 5);
		mv.display();
		
		System.out.println("***********************************"); 
		
		MovieWork mk = new MovieWork("매트릭스", 9, 10, 10, 8, 9);
		mk.display();
	}

}
