
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		boolean flag = true;
		String shapeChoice = "";
		Shape shape;
		while(flag){
			System.out.println("What type of shape do you want the area of? (triangle or pentagon)");
			shapeChoice = kb.nextLine();
			if (!shapeChoice.equals("triangle") && !shapeChoice.equals("pentagon")) {
				System.out.println("Try again: bad shape choice");
			} else break;
			
		}
		//Declare a shape variable then set it to either triangle or pentagon then do the stuff.
		if (shapeChoice.equals("triangle")) {
			System.out.print("Choose a base length: ");
			double base = kb.nextDouble();
			System.out.print("Choose a height: ");
			double height = kb.nextDouble();
			shape = new Triangle(base, height);
			System.out.println("Your area is . . . " + shape.area());
		}
		else if (shapeChoice.equals("pentagon")) {
			System.out.print("Choose a side length: ");
			double side = kb.nextDouble();
			shape = new Pentagon(side);
			System.out.println("Your area is . . . " + shape.area());
		}

			
	}

}
