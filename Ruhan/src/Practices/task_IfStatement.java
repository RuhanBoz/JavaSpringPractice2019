package Practices;
import java.util.Scanner;
public class task_IfStatement {

	public static void main(String[] args) {
		
		
		       int numberOfWaterMelon;
		       boolean lotsOfWaterMelon;
		       lotsOfWaterMelon = false;
		       numberOfWaterMelon = 40;

	         
	      if ( numberOfWaterMelon>=20 ) {
	    	  System.out.println("I have more than 20 watermelon");
	    	  lotsOfWaterMelon  = true; 
	      }
	      if (lotsOfWaterMelon) {
	    	  System.out.println("Good job");
	    	  
	      }
	      if (lotsOfWaterMelon==false) {
	    	  System.out.println("I need more watermelon");
	      }
	
	           // TASK 
	
	  /*
	   *  1. Write a java program: 
	   
	    a) Declare and initialize a number
	    b) Display whether the number is an odd number or even number.
	   
	  **  2. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
	    
	     Write a program that declares three integers as angles and check whether a triangle is valid or not.
	   
	  *** 3. Write a Java program to implement following logic using if-else statement
	    
	    a) if hour is less than 12 noon, greet with Good Morning
	    b) if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
	    c) if hour is greater than or equal to 3 pm, greet with Good Evening
	   */
	
	//            TASK 1
	
	      int num1 = 50;
	      
	      if (num1 % 2 == 0) {
	    	  System.out.println(num1 + " is even number.");
	      }
	      else {
	    	  System.out.println(num1 + " is odd number");
	      }
	      
	      //         TASK 2
	      Scanner input=new Scanner(System.in);
	      
	      
	      System.out.println("Enter the first angle");
	      int angle1 = input.nextInt();
	      System.out.println("Enter the second angle");
	      
	      
	      int angle2 = input.nextInt();
	      System.out.println("Enter the third angle");
	      int angle3 = input.nextInt();
	      
	      int sum=angle1+angle2+angle3;
	      
	      if (sum==180) {
	    	  System.out.println("Triangle is valid");
	    	  
	      }
	      
	      else {
	    	  System.out.println("Triangle is not valid");
	      }
	      
	      
	      
	      
	      
	      
	       //    TASK 3
	      
	      int hour = 16;
	      
	     
	      if ( hour < 12 ) {
	    	  System.out.println("Good Morning");
	    	  
	      }
	      
	      else if ( hour >= 12 && hour < 15 ) {
	    	  System.out.println("Good Afternoon");
	    	  
	      }
	      
	      else if ( hour >= 15) {
	    	  System.out.println("Good Evening");
	      }
	      
	      
	      
	      
	      /*
	         1. Program
	         => Declare 3 numbers
	         => Program should display which one is biggest
	         
	         
	         2. Write a program for the following logic:
	         => If marks<60,then print "Fail"
	         => If marks>=60,but less than 90,then print "Pass"
	         =>If marks>=90,then print"Passed with Distinction"
	       */
	      
	      int n1=-23;
	      int n2=-56;
	      int n3=-45;
	      
	
	      
	     if (n1>=n2 && n1>=n3) {
	    	 System.out.println(n1+" is the biggest");
	    	 }
	     
	     else if ( n2>=n1 && n2>=n3) {
	    	 
	    	 System.out.println(n2+" is the biggest");
	     }
	      
	     else {
	    	 System.out.println(n3+ " is the biggest");
	     }
	      
	      
	      
	      
	     int mark=90;
	     
	     if (mark<60)
	    	 System.out.println("Fail");
	     else if (mark>=60 && mark<90)
	    	 System.out.println("Pass");
	     
	     else 
	    	 System.out.println("Passed with Distinction");
	      
	
	}

}
