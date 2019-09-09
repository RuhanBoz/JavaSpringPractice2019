package day07_Unary_ShortHand;

public class UnaryOperators {

	public static void main(String[] args) {
		
		  /*
		     +  : Positive
		     -  : Negative
		     ++ : Increment
		     -- : Decrement
		    
		     + - ==> -
		     - - ==> +
		     + + ==> +   
		  */
		int a = 10;
		int b = -10;
		System.out.println(b);   // -10
		
		int c = + b;
		System.out.println(c);    // -10
		
		int d = -c;
		System.out.println(d);   // 10
		
        int f = - (10);
        System.out.println(f);     // - 10
        
        
        int num1 = 100;
        System.out.println( ++num1);  // 101
		    
		int num2 = ++num1;
		System.out.println(num2);   // 102
		
		int IntNum = 100;
		
		System.out.println( IntNum ++ );   // 100
		System.out.println( IntNum );    //  101
		
		
		
		
		
		
		
		
		
		
	}

}
