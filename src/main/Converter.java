package main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
	
	public static void convertLToO(double quantity) {
		double conversion = quantity * 33.814;
		DecimalFormat decimal = new DecimalFormat("#.000");
		System.out.println("The number of ounces you have is " + decimal.format(conversion));
	}
	
	public static void convertFToC(double quantity) {
		double conversion = (quantity - 32.0) * (5.0/9.0);
		DecimalFormat decimal = new DecimalFormat("#.0");
		System.out.println("The temperature in Celsius is " + decimal.format(conversion));
	}
	
	public static void convertMToF(double quantity) {
		double conversion = quantity * 3.37;
		DecimalFormat decimal = new DecimalFormat("#.00");
		System.out.println("The distance in feet is " + decimal.format(conversion));
	}
	
	private static void menuDisplay() {
		System.out.println("Select an option below.");
		System.out.println("1. Liters to US Fluid Ounces");
		System.out.println("2. Fahrenheit ot Celsius");
		System.out.println("3. Meters to Feet");
		System.out.println("4. Quit");
	}
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 4) {
		menuDisplay();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter option below:");
		int option = scanner.nextInt();
		if (option == 4) {
			break;
		}
		switch (option) {
			case 1:
				System.out.println("Insert Quantity of Liters");
				double liters = scanner.nextDouble();
				convertLToO(liters);
				break;
			case 2:
				System.out.println("Insert Fahrenheit Temperature");
				double temp = scanner.nextDouble();
				convertFToC(temp);
				break;
			case 3:
				System.out.println("Insert Distance in Meters");
				double distance = scanner.nextDouble();
				convertMToF(distance);
				break;
			default:
				System.out.println("Please choose a valid option.");
				continue;
		}
		System.out.println("Would you like to convert again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int choice = scanner.nextInt();
		if (choice == 1) {
			continue;
		}
		else {
			scanner.close();
			break;
		}
		}
		System.out.println("Have a good day!");
		
	}

}
