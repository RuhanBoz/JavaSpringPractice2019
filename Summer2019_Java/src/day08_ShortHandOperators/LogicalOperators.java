package day08_ShortHandOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/*
		 && : And logic
		 || : Or logic
		 
		 */
		//      && :
		
		boolean ResultA = 9 == 0 && "Muhtar" == "good";
		//                 false      false ==>  false
		
		System.out.println(ResultA);
		
		boolean ResultB = 8 > 5 && 7 == (8-2+1);
		//                true  &&  true   ==>  true
		System.out.println(ResultB);
				
		boolean ResultC = !false !=true && ! false ==!(!true);
		//                true   != true && true  == !false
		System.out.println(ResultC);       // false
		
		     //          || :
		
		boolean A = "Monday" == "Fun-day" || 6==6;
		System.out.println(A);         // true
		
		boolean B = true || false;  
		System.out.println(B);     //  true
		
		boolean C = ! (8 > 5) ||  !("Today" != "Friday");
		System.out.println(C); //     false
		
		boolean D = true && true || false;
		System.out.println(D);             // true
		
		boolean E = !(7 > 5 && 6 !=5) && (9 >5 || 10 > 4);
		System.out.println(E);   // false
		
		
		
		
		

	}

}
