package cls;

public class MyClass {
	private int number;			// 멤버변수
	public static int staticnumber;	// 정적변수, 프로그램의 시작부터 영역이잡힘 프로그램이끝날때 끝남
									// global 변수로도 사용가능
	
	public void method(int number) {		// 매개변수
		int localnumber;		// 지역변수
	}
	
	
	public void func() {
		int localnumber = 0;
		
		localnumber++;
		number++;
		staticnumber++;
		
		System.out.println("local변수:"+ localnumber);
		System.out.println("멤버변수:"+number);
		System.out.println("정적변수:"+staticnumber);
	}
}
