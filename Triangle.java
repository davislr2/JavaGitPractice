
public class Triangle extends Shape {
	
	public double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		double b = base;
		double h = height;

		double area = (b * h) * 1/2;
		return area;	
	}

}
