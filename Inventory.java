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
		int lemonsWanted = scanner.nextInt();
		int cost = lemonsWanted * priceLemons;
		if (cost <= userBudget) {
			lemons += lemonsWanted;
			userBudget -= cost;
		} 
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy sugar
		System.out.print("How many sugar cubes do you want to buy ($0.30 each)? ")
		int sugarWanted = scanner.nextInt();
		int cost = sugarWanted * priceSugar;
		if (cost <= userBudget) {
			sugar += sugarWanted;
			userBudget -= cost;
		} 
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy ice
		System.out.print("How many ice cubes do you want to buy ($0.06 each)? ")
		int iceWanted = scanner.nextInt();
		int cost = iceWanted * priceIce;
		if (cost <= userBudget) {
			ice += iceWanted;
			userBudget -= cost;
		} 
		else {
			System.out.println("Not enough money!");
		}
		
		//ask user to buy cups
		System.out.print("How many cups do you want to buy ($0.08 each)? ")
		int cupsWanted = scanner.nextInt();
		int cost = cupsWanted * priceCups;
		if (cost <= userBudget) {
			cups += cupsWanted;
			userBudget -= cost;
		} 
		else {
			System.out.println("Not enough money!");
		}
	}
}
