package test;

public class ClassTest_2 extends ClassTest_1 {
	String department;
	
	public ClassTest_2(String name, int salary, String department) { 
		super(name, salary);
		this.department=department;
	} 
	
	public void getInformation() { 
		System.out.println("이름:" + getName() + " 연봉:" + getSalary() + "부서: " + department); 
	} 
	
	public void prn() { 
		System.out.println("서브클래스"); 
	}	
	
	public void callSuperThis(){ 
		super.prn(); this.prn();
	}
}
