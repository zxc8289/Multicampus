package cls;

import singleton.Singleton;

public class heClass {
	private int height;
	private int weight;
	
	public heClass() {
		height = 173;
		weight = 76;
	}
	
	public void method() {
		Singleton s = Singleton.getInstance();
		s.height = height;
		s.weight = weight;
	}
}
