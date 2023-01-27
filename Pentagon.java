import java.lang.Math;

public class Pentagon extends Shape {
	public double sideLength;
	
	public Pentagon(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double area(){
		double area = (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));
		return area; 
	}

	public void setSide(double a) {
		sideLength = a;
	}
}
