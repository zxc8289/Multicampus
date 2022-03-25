package cls;

public class Rectangle extends Shape{
	int width; // 멤버변수
	int height; // 멤버변수
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean isSquare() {
		if(width==height){return true;}
		else{return false;}
	}
	
	public double calcArea() {
		return width*height;
	}
}

