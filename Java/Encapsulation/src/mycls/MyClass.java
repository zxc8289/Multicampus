package mycls;

public class MyClass {
	/*
	 	 Encapsulation == 은닉성, 캡슐화
	 	 멤버에 대해서 외부 접근 제어(차단, 읽기전용, 허용여부)
	 	 
	 	 접근 지정자
	 	 private : 개인적인
	 	 public : 대중적인
	 	 protected : 상속에 따른 보호
	 */
	private int number;
	protected double height;
	public String name;
	
	public void setNumber(int number) {		// setter
		this.number=number;
	}
	
	public int getNumber() {		// getter
		return this.number;
	}
}
