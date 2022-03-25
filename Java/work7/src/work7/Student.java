package work7;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int ban;
	int no;
	
	/*
	int getTotal(int kor, int eng, int math) {
		total = kor+eng+math;
		return total;
	}
	
	double getAverage() {
		return (double)total/3;
	}
	*/
	
	int getTotal(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		return kor + eng + math;
	}
	
	double getAverage() {
		return (double)(kor+eng+math)/3;
	}
}

