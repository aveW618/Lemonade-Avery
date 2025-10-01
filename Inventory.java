import java.util.Scanner;

public class Inventory {
	//defining variables for inventory goods
	int lemons;
	int sugar;
	int ice;
	int cups;
	
	//main method begins
	public static void main(String [] args) {
		//create budget object
		Budget userBudget = new Budget();
		//set starting budget
		userBudget = 20;
		//start game
		System.out.println("Welcome to the Lemonade Stand Game!");
		System.out.println("Your starting budget is $" + userBudget);
		
		//Set inventory item prices
		int priceLemons = 0.7;
		int priceSugar = 0.3;
		int priceIce = 0.06;
		int priceCups = 0.08;
		
		//ask user to buy lemons
		System.out.print("How many lemons do you want to buy ($0.70 each)? ")
		//Scanner class to get user input
		int lemonsWanted = scanner.nextInt();
		//calculate cost
		int cost = lemonsWanted * priceLemons;
		//compare cost to budget
		if (cost <= userBudget) {
			//add lemons to inventory
			lemons += lemonsWanted;
			//subtract cost from budget
			userBudget -= cost;
		} 
		//if cost is over the budget, tell user
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy sugar
		System.out.print("How many sugar cubes do you want to buy ($0.30 each)? ")
		//Scanner class to get user input
		int sugarWanted = scanner.nextInt();
		//calculate cost
		int cost = sugarWanted * priceSugar;
		//compare cost to budget
		if (cost <= userBudget) {
			//add sugar to inventory
			sugar += sugarWanted;
			//subtract cost from budget
			userBudget -= cost;
		} 
		//if cost is over the budget, tell user
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy ice
		System.out.print("How many ice cubes do you want to buy ($0.06 each)? ")
		//Scanner class to get user input
		int iceWanted = scanner.nextInt();
		//calculate cost
		int cost = iceWanted * priceIce;
		//compare cost to budget
		if (cost <= userBudget) {
			//add ice to inventory
			ice += iceWanted;
			//subtract cost from budget
			userBudget -= cost;
		} 
		//if cost is over the budget, tell user
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy cups
		System.out.print("How many cups do you want to buy ($0.08 each)? ")
		//Scanner class to get user input
		int cupsWanted = scanner.nextInt();
		//calculate cost
		int cost = cupsWanted * priceCups;
		//compare cost to budget
		if (cost <= userBudget) {
			//add cups to inventory
			cups += cupsWanted;
			//subtract cost from budget
			userBudget -= cost;
		} 
		//if cost is over the budget, tell user
		else {
			System.out.println("Not enough money!");
		}
		
		//print out final inventory and budget information for user
		System.out.println("Final Inventory: ");
		System.out.println("Lemons: " + lemonsWanted);
		System.out.println("Ice: " + iceWanted);
		System.out.println("Sugar: " + sugarWanted);
		System.out.println("Cups: " + cupsWanted);
		System.out.println("Money Left: $" + userBudget);
	}
}
