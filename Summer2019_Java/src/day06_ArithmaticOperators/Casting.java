package day06_ArithmaticOperators;

public class Casting {

	public static void main(String[] args) {

		// implicit casting: gizli olan ya da otomatik olan, kucuk kabi buyuk kabin icine koymak gibi
		
		double a=5; // 5 int 5.0 implicit casting denir.
		
		System.out.println(a);
		
		// explicit casting
		
		int b=(int)5.6;
		
		System.out.println(b);
		
		
		
		double f;
		double c=200;
		
		f=  (double)3/5*c;
		
		
		
		System.out.println(f);
		
		
		System.out.println((int)7.8);
		
		System.out.println((int)(7.9+6.7));
		
		System.out.println((double)(17));
		
		System.out.println((double)(7)/2);
		
		System.out.println((double)7/2);
		
		System.out.println((double)(7/2));
		
		System.out.println((int)(7.8+(double)(15)/2));
		
		
		
		
		
		
		
		
		 
	                  // KAHOOT	 
		
		int aa = 30;
		int bb = (byte) aa;
		
	    System.out.println(bb);   // 30
		
		  
		System.out.print("Result A "+0+1);   // "Result A0"+1
                                               		
		System.out.println(";Result B"+(1)+(2));  // "Result A 01; Result B12"
		
		System.out.println("Result B "+ (1+2));
	
	    
		System.out.println("5 + 2 =" +3+4);          //5 + 2 =34
	
		System.out.println("5 + 2 = " + (3+4) );     // 5 +2 = 7
		
		
		
		float FloatNum = 100.98765432f;
		short ShortNum = (short) FloatNum;
		
		System.out.println(ShortNum);      // 100
		
		
	
		System.out.println((3+2) *2 /3%2 );   // 1
		                //   5   *2 /3%2
		                //     10/3 %2
		                 //    3%2
		                    // 1
	    

	    
	    
	    long Lnum = 3_000L;
	    double d = (float)a;
	    int i = (short) d;
	    System.out.println(i%1000);   // 0
	    
	
	     double result1 = (int) 10/3;
         System.out.println(result1);	 //3.0
	
	     System.out.println( 10 / 3.0);   // 3.33333333
	

	      int I1 = 10, I2 = 20, I3 = 30;
	      I1 = I1 % 5;   // I1 = 0
	      I2 = I2 % 5;   // I2 = 0
	      I3 = I1 * I2;    // I3 = 0
	      
	      System.out.println(I1 + "\t" + I2 + "\t" + I3);  // 0 0 0
	      
	
	     
	
	}

}
