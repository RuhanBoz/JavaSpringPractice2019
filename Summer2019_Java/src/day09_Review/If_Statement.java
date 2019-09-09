package day09_Review;

public class If_Statement {

	public static void main(String[] args) {
		
		/*
		 * if statements:
		 *    
		 *    single if statement:
		 * 
		 *       if (boolean expression){
		                  some codes to run
		         }   
		           if block only gets executed if the condition is true
		 */
		
		if( true ) {
			System.out.println("Hello");
		    System.out.println("Happy Friday");
		    System.out.println("Tomorrow is day off");
		    System.out.println("class starts on Monday");
		}
		   
		  int a= 1000;               // 1001
		  
		  if ( a++ == 1001 ) {
	//		  1000 == 1001  ==> false  
			  a = 2000;
			      System.out.println("a is increased");
			   }
		
		System.out.println(a+"\n");
		
		  int X= 987654320;
		  
		  if ( X%2 == 0 ) {
			  System.out.println(X);
			  System.out.println(" it's an even number");
		  }

		 if(    X%2 != 0 ) {                            //  false
			 System.out.println(X);
			 System.out.println("it's an odd number ");
		 }
		 
		  int Y = 2345678;
		  if ( Y % 5 == 0 ) {
			  // 
			  System.out.println(Y+" can be divided by 5 \n\n ");
		  }
		 
		  if ( Y % 5 != 0 ) {
			  System.out.println(Y+" can't be divided by 5 \n\n ");
		  }
		  
		  String CEO = "Main Boss";
		  String Kuzzat = "Main Boss";
		  
		  System.out.println(CEO == Kuzzat ); // true
		  
		  if (Kuzzat == CEO ) {
			  // TRUE
		     System.out.println( "Great Person in the world" );
		     System.out.println( "First if block" );
		  }
		  if (Kuzzat != CEO) {
			  // false
			  System.out.println( "Great Person in the world" );
	          System.out.println( "Second if block" );	  
		  }
		  
		  int TotalNumber = 100;
		  boolean Cybertek = true;
		  boolean BestSchool = true;
		  
		  if (Cybertek == BestSchool) {
			  // true
		     TotalNumber += 500; // TotalNumber = 600
		  }
		  
		  if (Cybertek != BestSchool) {
			  TotalNumber -= 50;
		   }
		  
		  System.out.println(TotalNumber);
		  
		  /*
		   1. Declear a variable, and initialize user age
		   2.write a program if the user is eligible to vote for Donald Trump
		      vote age is: 18
		   */
		  
		  byte PersonAge = 17;   // 17 yas ve alti eligible degil // 18 ve uzeri eligible to vote
		  byte VoteAge = 18;
		  
		  if ( PersonAge >= VoteAge ) {
			  // true
		      System.out.println( "\n\nYes you are eligible to vote" );	
		      System.out.println( "have fun with building the wall" );
			  System.out.println( "MAGA" );        // Make America Great Again
		  }
		  
		  if (PersonAge < VoteAge) {
			  // false
			  System.out.println( "You are not eligible to vote yet, please grow up");
		  }
		  
		  
	}

}
