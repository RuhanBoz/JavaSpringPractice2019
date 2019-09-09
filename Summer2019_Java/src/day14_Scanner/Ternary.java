package day14_Scanner;

public class Ternary {

	public static void main(String[] args) {
		

		/*
		 in Ternary:
			 if(condition)   	 ==> (Condition)?
			 else            	 ==>    :
			 else if(Condition)  ==> :(Condition)?
		 */
		
		
			int num = 0;
			
			if(false) {
				num = 100;
			}else {
				num = 50;
			}
				
		int n =	(false)? 100 : 50 ;   // ternary returns a Value
		
		int y =	false ? 100 : 50;  
					System.out.println(50 );
		
		System.out.println(num);  // 50
		System.out.println(n);  // 50
		System.out.println(y);
		
		
			String Schoolname ="";
			boolean Batch12 = true;	
			if(Batch12) {
				Schoolname ="Cybertek";
			} else {
				Schoolname ="Invalid";
			}
			
		System.out.println(	Batch12 ? "Cybertek" : "Invalid" );
			
		String BestSchool = Batch12 ? "Cybertek" : "Invalid"; 
		
		System.out.println(BestSchool);
		
			
				double d = 10;
				if(true) {
					d= 10.5;
				}
		
			double z = true ? 10.5 : 0;
			// in ternary, total number of ? and :  has to be equal
		
		
			double interestRate = 0;
			boolean GoodCredit = true;
		
			interestRate = GoodCredit == true ? 0.5 : 0.9 ;
			System.out.println(interestRate);
			
			
		  
		
		
		
		
		
		
		
		
		
		
		
	}

}
