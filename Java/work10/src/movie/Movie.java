package movie;

public class Movie {
	String title; 	
	int director; 	
	int acter; 		

	public Movie(String title, int director, int acter) {
		this.title = title;
		this.director = director;
		this.acter = acter;
	}

	public void display() {
		int total = director + acter;
		String result = "";
		
		System.out.printf("영화제목:%s\n", title);
		System.out.printf("감독:%d, 배우:%d\n", director, acter);
		System.out.printf("영화총점 :%d\n", total);
		
		if (total >= 15)
			result = "☆☆☆☆☆";
		else if (total >= 12)
			result = "☆☆☆☆";
		else if (total >= 10)
			result = "☆☆☆";
		else
			result = "☆☆";
		
		System.out.println("영화평점 : " + result);
	}

}
