import java.lang.Math;

public class Triangle extends Shape {
	
	public double base;
	public double height;	

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		double area = (base * height) / 2;
		return area;
	}
}
