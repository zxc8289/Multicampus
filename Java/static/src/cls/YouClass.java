package cls;

public class YouClass {
	public void memberMethod() {
		System.out.println("YouClass memberMethod()");
	}
	
	public static void staticMethod() {
		System.out.println("YouClass staticMethod()");
		
		// 멤버변수,this,super 접근불가능
		
	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println("i="+i+" j="+j);
	}
}

