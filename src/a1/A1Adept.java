package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Create variable for how many items are in the store
		int itemCount = scan.nextInt();
		// Create array for names of items and prices of items
		String[] itemNames = new String[itemCount];
		double[] itemPrices = new double[itemCount];
		for (int i = 0; i < itemCount; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		// Create variable for how many customers
		int customers = scan.nextInt();
		
		// create variables to hold first and last names
		String first = "";
		
		String last = "";
		
		// create variables for biggest and smallest spenders
		String biggest = "";
		
		String smallest = "";
		
		// create variables for biggest and smallest amount spent
		double most = 0;
		
		double least = 0;
		
		// create variable for total amount spent
		double total = 0;
		
		// set up for loop to go through number of customers
		for (int i = 0; i < customers; i++) {
			first = scan.next();
			last = scan.next();
			// create variable for how many kinds of items they bought
			int numberItems = scan.nextInt();
			// create variable to hold total spent by current customer
			double cost = 0;
			// write code to calculate total amount spent by current customer
			for (int j = 0; j < numberItems; j++) {
				int howMany = scan.nextInt();
				// find price of item
				double price = 0;
				String product = scan.next();
				for (int k = 0; k < itemCount; k++) {
					if (itemNames[k].compareTo(product) == 0) {
						price = itemPrices[k];
						break;
					}
				}
				cost = cost + howMany * price;
			}
			// update total amount spent
			total = total + cost;
			// change biggest and smallest if necessary
			if (i == 0) {
				most = cost;
				least = cost;
				biggest = first + " " + last;
				smallest = biggest;
			} else if (cost > most) {
				most = cost;
				biggest = first + " " + last;
			} else if (cost < least) {
				least = cost;
				smallest = first + " " + last;
			}
		}
		// write code to calculate average
		String average = String.format("%.2f", total / customers);
		
		// translate most and least into 2 decimal places
		String newMost = String.format("%.2f", most);
		String newLeast = String.format("%.2f", least);
		// write print out code
		System.out.println("Biggest: " + biggest + " (" + newMost + ")");
		System.out.println("Smallest: " + smallest + " (" + newLeast + ")");
		System.out.println("Average: " + average);
		
		// close scanner
		scan.close();
	}
}
