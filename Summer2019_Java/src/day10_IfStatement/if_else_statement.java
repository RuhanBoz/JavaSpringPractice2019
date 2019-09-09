package day10_IfStatement;

public class if_else_statement {

	public static void main(String[] args) {
		
		/*
		    if & else:
		 
		      if (Condition) {
		           // A
// If block only gets executed if the condition is true
		    }
		    
		    else {
		    // 
// else block only gets executed if the condition is false
		 }
		 */
                if ( 9 > 8) {
                	System.out.println("9 is greater than 8");
                	
                }
		
		        if ( 9 < 8 ) {
		        	System.out.println("9 is less than 8");
		        }
		
		        if ( 9 == 8) {
		        	System.out.println("9 is equal to 8");
		        }
		    
		       if ( 9 >= 8 ) {
		    	   System.out.println("9 is less or equal to 8");
		       }
		
		       else {
		    	   System.out.println("9 is great than 8");
		       }
	
	
	       if(false == !false) {
	    	   // false
	    	   System.out.println("if block");
	       }
	
	else {
		System.out.println("else block");
	}
	
	/*
	 Task01:
	 	if score < 60  ==> failed
	 	if score >=60 but score < 90 ==> pass
	 	
	 */
	
	int score =59;
	if( score >= 60) {
		
		System.out.println("Passed");
		
	} 
	else {
		
		System.out.println("Failed");
		
	}
	
	
	/*
	 1. triangle: has three angles, 
	 			and sum of three angles MUST be equal to 180
	 			
			1. declare three variables angle1, angle2, angle3
			2. write a program to check if the triangle is valid or not
	 
	 */
	
	int angle1 =150, angle2 = 20, angle3 = 10;
	boolean valid = (angle1+angle2+angle3) ==180;
	
	if(valid) {
		
		System.out.println("it's a valid triangle");
		
	} else {
		
		System.out.println("Invalid triangle, do some math");
		
	}
	
	       
	
	
	
	
	
	
	
	
	
	
	
	
	       /*
	  	 if-else if-else:
	  	 		if(condition1){
	  	 			// A ==> if condition1 is true
	  	 		}
	  	 		else if( condition2 ) {
	  	 			//B   ==> if condition1 is false and condition2 is true
	  	 		}
	  	 		else {
	  	 			//C  ==> if condition1 and condition2 are both false
	  	 		}
	  	 
	  	 */
	  	
	  	
	  		
	  		if(false) {
	  			System.out.println("if block");
	  		}
	  		else if(false) {
	  			System.out.println("else if block");
	  		}
	  		else {
	  			System.out.println("else block");
	  		}
	  		
	  		
	  		
	  		
	
	
	
	
	
	
	
	
	
	
	}

}
