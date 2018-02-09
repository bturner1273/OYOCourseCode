package kidOYO;

import java.util.Scanner;
public class ExactChangeCalculator {
//what is price of item?
//how much cash are you handing me?
//exact change is:
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How much does the item cost that you are purchasing?");
		double price = input.nextDouble();
		System.out.println("How much money are you handing me?");
		double amountPaid = input.nextDouble();
		if(price > amountPaid){
			System.out.println("You owe me " + (price-amountPaid) + " dollars this can be paid with:");
			calculateChange(price-amountPaid);
		}else{
			System.out.println("Your exact change is: " + (amountPaid-price));
			calculateChange(amountPaid-price);
		}
	}
	public static void calculateChange(double difference){
		int change = (int)(difference*100);
	    int dollars = (int)(change/100);
	    change=change%100;
	    int quarters = (int)(change/25);
	    change=change%25;
	    int dimes = (int)(change/10);
	    change=change%10;
	    int nickels = (int)(change/5);
	    change=change%5;
	    int pennies = (int)(change/1);

	    System.out.println("Dollars: " + dollars);
	    System.out.println("Quarters: " + quarters);
	    System.out.println("Dimes: " + dimes);
	    System.out.println("Nickels: " + nickels);
	    System.out.println("Pennies: " + pennies);
	}
}
