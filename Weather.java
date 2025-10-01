import java.util.Random;

public class Weather {
	public static void main(String [] args) {
		//setting a random object
		Random random = new Random();
		//get a random int between 0 and 3 (4 different weather types)
		int weatherInt = random.nextInt(4);
		//for each of the random values, set it equal to a weather 
		if (weatherInt == 0) {
			String todaysWeather = "rainy";
		} 
		else if(weatherInt == 1) {
			String todaysWeather = "sunny";
		} 
		else if(weatherInt == 2) {
			String todaysWeather = "cloudy";
		} 
		else if(weatherInt == 2) {
			String todaysWeather = "chilly";
		}
		//print out the weather to the user
		System.out.println("today's weather is: " + todaysWeather);
		
		//Generate a random temperature bewtween 50-100 to help regulate
		//customer satisfaction based on number of ice cubes
		int temperature = random.nextInt(51) + 50;
		
		//print out temperature
		System.out.println("Today's temperature: " + temperature + "in F");
		
		//set each temperature range to an ideal number of ice cubes
		if (temperature <= 65) {
			int idealIceCubes = 1;
		}
		else if (temperature <= 75) {
			int idealIceCubes = 2;
		}
		else if (temperature <= 85) {
			int idealIceCubes = 3;
		}
		else {
			int idealIceCubes = 4;
		}
		
		//ask user for ice cube number
		System.out.println("How many ice cubes do you want to use (1-4)? ");
		
		int chosenIceCubes = scanner.nextInt();
		
		//deciding and printing out customer satisfaction
		if (chosenIceCubes == idealIceCubes) {
			System.out.println("Your customers are very happy!");
		}
		else if (Math.abs(chosenIceCubes - correctIceCubes) == 1) {
			System.out.println("Your customers are fine, but not happy.");
		}
		else {
			System.out.pritnln("Your customers are unhappy");
		
	}

		
		
		
