package Practices;

import java.util.Scanner;
public class SelfStudy2 {

	public static void main(String[] args) {

		 // TASK1
		/*	
			Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
			User should be able to enter unit price and quantity.
			Then the program will perform calculations and display amounts.
			The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
			If the quantity purchased is less than 100 units, the discount rate is 0%.
			See the example output as shown below:
			Input:
			Enter unit price: 25
			Enter quantity: 110
			Output:
			Grand Total: $ 2750.0
			Discount: 10%
			Discount applied: $ 275.0
			Total: $ 2475.0
	    */

		double quantity, unitPrice, grandTotal, total = 0, discountApplied=0;
		int discount=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter unit price:");
		
		unitPrice=input.nextDouble();
		
		
		System.out.println("Enter quantity");
		quantity=input.nextDouble();
		
		if (unitPrice>=0 && quantity>=0) {
			
			
		grandTotal=unitPrice*quantity;
		
		if( quantity>=100 && quantity<=120) {
			
			discount=10;
			discountApplied=grandTotal*0.10;
			total= grandTotal-discountApplied;
			
		}
		
		
		 if(quantity>120) {
			
			discount=15;
			discountApplied=grandTotal*0.15;
			total=grandTotal-discountApplied;
			
		}
			
		if (quantity<100) {
			
			discount=0;
			total=grandTotal;
		}
		
		System.out.println("Grand Total: $ "+grandTotal);
		
		System.out.println("Discount: "+discount+"%");
		
		System.out.println("Discount applied: $ "+discountApplied);
		System.out.println("Total: $ "+total);
		
		
		}	
		else {
			System.out.println("Invalid Entry");
		}
		
	}

}
