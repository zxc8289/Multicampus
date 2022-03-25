package cls;

public class Circle extends Shape{
	double r; // 멤버변수
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}


	@Override
	public double calcArea() {
		return r*r*Math.PI;
	}
}
