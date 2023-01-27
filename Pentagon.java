import java.lang.Math;

public class Pentagon extends Shape{
	private int sideLength;

	public Pentagon(int sideLength) {
		this.sideLength = sideLength;		
	}

	@Override
	public double area() {
		int a = sideLength;
		double apothem = sideLength / (2 * Math.tan(Math.PI/5));
		double perimeter = 5 * sideLength;
		double area = (perimeter * apothem) * 2;
		return area;
	}
}

