
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		boolean flag = true;
		String shapeChoice;
		while(flag){
			System.out.println("What type of shape do you want the area of? (triangle or pentagon)");
			shapeChoice = kb.nextLine();
			if (!shapeChoice.equals("triangle") && !shapeChoice.equals("pentagon")) {
				System.out.println("Try again: bad shape choice");
			} else break;
			
		}
		//Declare a shape variable then set it to either triangle or pentagon then do the stuff.
		if (shapeChoice.equals("triangle") {

		}
		else if (shapeChoice.equals("pentagon") {
	
		}	
	}

}
