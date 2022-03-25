package cls;

import singleton.Singleton;

public class YouClass {
	private int total;
	private String name;
	private int height;
	private int weight;
	
	public void func() {
		Singleton s = Singleton.getInstance();
		total = s.number;
		name = s.name;
		height = s.height;
		weight = s.weight;
		
	}
	
	public void total(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "YouClass [total=" + total + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
	
}
