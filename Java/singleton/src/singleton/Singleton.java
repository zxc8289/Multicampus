package singleton;

public class Singleton {
	private static Singleton single = null;
	public int number;
	public String name;
	public int height;
	public int weight;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(single == null) {				// 1번만 실행
			single = new Singleton();
		}
		return single;	// single ton -> 1개의 instance만을 사용한다.
	}
}
