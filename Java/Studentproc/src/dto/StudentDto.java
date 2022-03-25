package dto;

public class StudentDto {
	private int number;
	private String name;
	private double height;
	private int eng;
	private int kor;
	private int math;
	
	public StudentDto() {
		
	}

	public StudentDto(int number, String name, double height, int eng, int kor, int math) {
		super();
		this.number = number;
		this.name = name;
		this.height = height;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "StudentDto [number=" + number + ", name=" + name + ", height=" + height + ", eng=" + eng + ", kor="
				+ kor + ", math=" + math + "]";
	}
	
	
}
