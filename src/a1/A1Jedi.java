package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// create variable for number of items in store
		int items = scan.nextInt();
		// create array for all the items
		String[] itemsList = new String[items];
		for (int i = 0; i < items; i++) {
			itemsList[i] = scan.next();
			// skip prices input
			double skip = scan.nextDouble();
		}
		// create array for counts all the items
		int[] itemsCount = new int[items];
		// create array for counts of customers buying items
		int[] customerCount = new int[items];
		// create variable for number of customers
		int customers = scan.nextInt();
		// write for loop to count items
		for (int i = 0; i < customers; i++) {
			// variable for name
			String first = scan.next();
			String last = scan.next();
			// variable for how many items bought
			int products = scan.nextInt();
			// create separate array to show items already purchased
			String[] purchases = new String[products];
			// for loop to scan through all the products
			for (int j = 0; j < products; j++) {
				// variable to hold how many of each product
				int quantity = scan.nextInt();
				// variable for product name
				String productName = scan.next();
				// change arrays as needed
				for (int k = 0; k < items; k++) {
					if (itemsList[k].compareTo(productName) == 0) {
						itemsCount[k] += quantity;
						if (!checkIfBought(productName, purchases)) { 
							customerCount[k] += 1;						}
					}
				}
				// update purchases array
				purchases[j] = productName;
			}
		}
		for (int i = 0; i < items; i++) {
			if (customerCount[i] == 0) {
				System.out.println("No customers bought " + itemsList[i]);
			} else {
			System.out.println(customerCount[i] + " customers bought " + itemsCount[i] + " " + itemsList[i]);
			}
		}
		
	}
	
	public static boolean checkIfBought(String product, String[] purchased) {
		for (int i = 0; i < purchased.length; i++) {
			if (purchased[i] == null) {
				return false;
			} else if (product.compareTo(purchased[i]) == 0) {
					return true;
			}
		}
		return false;
	}

}
