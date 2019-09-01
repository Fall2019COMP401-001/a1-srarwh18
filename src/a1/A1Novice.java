package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Check how many customers there are
		int customers = scan.nextInt();
		
		// Set up for loop for however many customers
		for (int i = 0; i < customers; i++) {
			// Create variable for first letter of name
			char first = scan.next().charAt(0);
			// Create variable for last name
			String last = scan.next();
			// Set up variable for how many items they bought
			int items = scan.nextInt();
			// Set up variable for total sum
			double total = 0;
			// Set up loop to get sum of items bought
			for (int j = 0; j < items; j++) {
				// Create variable for how many of current product they bought
				int count = scan.nextInt();
				// Need to skip next word
				String name = scan.next();
				// Create variable to hold price of current product
				double price = scan.nextDouble();
				// change total to reflect accumulating price
				total = total + count * price;
			}
			// change total to a rounded 2 decimal string
			String newTotal = String.format("%.2f", total);
			// print out each line in right format
			System.out.println(first + ". " + last + ": " + newTotal);
		}
		
		// all input parsed, close scanner
		scan.close();
		
	}
}
