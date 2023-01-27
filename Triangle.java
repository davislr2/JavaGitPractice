
public class Triangle extends Shape {
	
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		int b = base;
		int h = height;

		double area = ((1/2) * b) * h;
		return area;	
	}

}
