package day08_ShortHandOperators;

public class ShortHand {

	public static void main(String[] args) {
		
		       int a = 9;
		           a = a+3;
		System.out.println(a);   // 12
		
		      int b = a += 5;   
		             //  12+5=17
		System.out.println(b);     // 17
		   
		      int c = a += b;                  // a = 34,        b = 17,      c = 34
		          // 17 += 17 = 34
		System.out.println(c);
		
             int d = a += c;
             
             System.out.println(d);        // a=68,  b=17,  c= 34,   d= 68
		
		      int e = (d+=b) * 2;
		            // (68+17)*2
	                //   85*2	      
	         System.out.println(e);	          // d = 85,  b= 17,   e = 170
	
	      int f = b += d * 2;
	         //  b+=170
	         // 17 +=170
	       System.out.println(f);         // 187              b =187
	
	    // -= :
	       
	       int g = 101;
	       int h = g -= 1;
	       
	       System.out.println(h);           // g=100    h = 100
	    
	        int i = g+= h+5;
	        System.out.println(i);         // i = 205           g = 205       h = 100
	
	       int j = h+= g%i ;
	       System.out.println(j);     // j=100      h=100
	
	      int k = j -= h * 2 % 5;
	      System.out.println(k);      // k=100    j=100
	        
	
	    // *= :
	      
	      int A = 100;
	      A *= 200;
	      System.out.println(A);      // 20000           a=20000
	
	      int B = 100;
	          B *= 100 / 10;
	      System.out.println(B);         //1000
	
	         B *= B - 1000;
	         System.out.println(B);       // 0
	
	     // /= :
	         
	         int C = 1000;
	             C/=5;
	         System.out.println(C);    //C=200
	            		 
	         int D=10;
	         
	//  C /= D-10;       denominator can't be zero
	         System.out.println(C);    // C=200
	         
	         C /=D+10;
	        		 
	        		 
	        // %= :
	        		 
	      int z = 10%3;
	
	
	         
	         
	         
	         int J = 300;
	         int K = 10;
	         
	         J += J %= K;
	         System.out.println(J);        // 300
	         
	         
	         
	
	
	
	}
	
	 

}
