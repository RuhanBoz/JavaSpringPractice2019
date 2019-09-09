package practice;

public class Task01_greaterNumber {

	public static void main(String[] args) {
	
       int num1,
           num2,
           max ;
	 
      num1 = 10;
      num2 = 100;
      max = 0;
     
      if (num1<num2) {
    	max = num2;  
      }
      
     if (num2<num1) {
       max = num1;
    
     }
    
     if (num1==num2) {
    	max=num1;
    	
     }
     System.out.println("the larger num is  " + max);
      
	}

}
