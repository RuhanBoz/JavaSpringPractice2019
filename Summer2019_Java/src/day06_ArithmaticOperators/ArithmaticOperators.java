package day06_ArithmaticOperators;

public class ArithmaticOperators {

     public static void main(String[] args) {
	
        /*
          + : ADDITION , adds two numbers together
          - : SUBTRACTION, subtracts a number from another number
          * : MULTIPLICATION, multiples
          / : DIVISION , divides
           
          % : REMAINDER, returns the remainder from the division 
          
         */
		
		 int a = 100;
		 int b = a - 400;    // -300
		 System.out.println(b);
		 
		 int c = a+b;  // 100 + - 300 = -200
		 System.out.println(c);
		   
		 int x = 3, y = 5, z = x*y;
		 System.out.println(z);       // 15
		 
		 int length = 100,
			 width = 10, 
		     area = length/width;
		 
		 System.out.println(area);            // 10
		 System.out.println( 3 + 5 + 4 -2 );   // 10
		  	 
	/*
	double resultNum = 9/0;
		System.out.println(resultNum);      // denominator cannot be 0
	*/
		
		
		double Number1 = 10.0/3;
		System.out.println(Number1);   // 3.33333333333
		
		  int output = 12+6/3;
		  System.out.println(output);   // 14
		
		System.out.println( 5 + 2 * 4 );    // 13
		
		System.out.println( 10 / 2 - 3 );  // 2
		
		System.out.println( 8 + 12 * 2 );  // 32
		
		
		  int result1 = 10%3;
		  System.out.println(result1);    // 1
		  
		  System.out.println( 12%5 );   // 2
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
