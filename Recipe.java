import java.util.Scanner;

public class Recipe {
	public static void main(String [] args) {
		//create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Ask the user for their recipe
		System.out.println("How many lemons per cup? (0-2) ");
		int lemonsPerCup = scanner.nextint();
		
		System.out.println("How many sugar cubes per cup? (0-4) "); 
		int sugarPerCup = scanner.nextint();
		
		//compare user's lemon recipe to ideal recipe for customer satisfaction
		if (lemonsPerCup == 1) {
			System.out.println("Lemon amount is perfect!");
		}
		else if (lemonsPerCup == 2) {
			System.out.println("Way too sour!");
		}
		else {
			System.out.println("Way too bland!");
		}
		
		//compare user's sugar recipe to ideal recipe for customer satisfaction
		if (sugarPerCup == 2) {
			System.out.println("Sweetness is perfect!");
		}
		else if (sugarPerCup == 1) {
			System.out.println("Close but not sweet enough!");
		}
		else if (sugarPerCup == 0) {
			System.out.println("Not sweet enough!");
		}
		else {
			System.out.println("Way too sweet!");
		}
	}
}
	
