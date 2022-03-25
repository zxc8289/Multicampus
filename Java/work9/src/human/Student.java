package human;

public class Student extends Human {
	String sID;

	public Student(String name, int age, int height, int weight, String sID) {
		super(name, age, height, weight);
		this.sID = sID;
	}

	@Override
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + sID;
		return data;
	}
}
