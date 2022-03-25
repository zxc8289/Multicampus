package health;

public class HealthRate extends Health {
	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double Sweight() {
		return (height - 100) * 0.9;
	}

	private String obesity() {
		double B = (weight - Sweight()) / Sweight() * 100;
		if (B < 10)
			return "정상입니다.";
		else if (B >= 10 && B < 20)
			return "과체중입니다.";
		else
			return "비만입니다.";
}

@Override 
public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게%.0f %s\n", name, height, weight,obesity()); } 
}