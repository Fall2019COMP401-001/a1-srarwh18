package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		
		for (int i = 0; i < customers; i++) {
			char first = scan.next().charAt(0);
			String last = scan.next();
			int items = scan.nextInt();
			double total = 0;
			for (int j = 0; j < items; j++) {
				int count = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total = total + count * price;
			}
			String newTotal = String.format("%.2f", total);
			System.out.println(first + ". " + last + ": " + newTotal);
		}
		
		scan.close();
		
	}
}
