package day12_SwitchStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		   /*
	     swicth statement does the similar thing like multi-branch if statement
	     
	            switch(Expression){
	                case CaseVale: 
	                        statements1
	                        statements2
	                        break;
	                        
	                default: 
	                    statement;
	            
	            }
	     
	     
	     */
	  
	        
	    
	    int score =1; 
	    if( score ==1 ) {  // MUSt give boolean expression
	        System.out.println("1");
	    } 
	    else if (score == 2) {
	        System.out.println("2");
	    } else {
	        System.out.println("Invalid");
	    }
	    
	    
	    switch(score) { // Must give an Expression: data
	        case 1:
	            System.out.println("1");
	            break;
	            
	        case 2:
	            System.out.println("2");
	            break;
	        
	        default:
	            System.out.println("Invalid");
	            break;
	        
	    }
	    
	    
	    switch(score) { // Must give an Expression: data
	        case 2:
	            System.out.println("2");
	            break;      
	    
	        case 1:
	            System.out.println("1");
	            break;  // closing statement
	        
	        
	            
	        default:
	            System.out.println("Invalid");
	            break;
	    }
	    
	    
	        String str ="Java";
	        
	        switch (str) {
	            
	            case "C#":
	                System.out.println("C# programming Language");
	                break;  
	            // System.out.println("C# programming Language"); 
	                    // case was closed at line 76
	                
	            case "Python":
	                System.out.println("Python programming language");
	            
	            default:  // else
	                System.out.println("Invalid");
	        }
	    
	    
	    
	    char grade = 'A';
	    
	    switch(grade) {
	                
	        case 'B': 
	                System.out.println("Passed with B");
	                
	        case 'C':
	                System.out.println("Passed with A");
	                
	        default:
	            System.out.println("Failed");
	            
	    }  // switch statement only exits when there is break statement or }
	    
	    
	
	
		int num = 5;
		
		switch( num ) {		
			case 7 :
				System.out.println("Sunday");
				break;  // case closed/dismissied
//it's used for exiting switch statement after the case is executed
		
			default:
				System.out.println("Invalid Entry");
				System.out.println("Invalid");
				break; // exits the switch statement
		//	System.out.println("Wednesday");  
//break statement means the closing statement, cannot give any more statements after the break
				
			case 5:
				System.out.println("Friday");
				break;		
		}
		
		
		String days ="Monday";
		
		switch ( days ) {
			default:
				System.out.println("Invalid");
				
			case "Monday": 
				System.out.println("Monday is fun day");	
				
			case "Tuesday":
				System.out.println("Tuesday is great day");	
				break;
		//		break;
				
			case "Wednesday":
				System.out.println("Wednesday is day off");								
		}
		
		
		long N1 = 10; // 10L
	//	switch (N1) { }
		
		float N2 =100; //100.0f
	//	switch(N2) { }
		
		double N3 = 10;
//		switch (N3) {   }
		
		boolean N4 = true; //  9 < 8
	//	switch (N4) { }
		
		
		char ch = 'A';
		switch(ch) { }
	
		
		// or logic:
			char grd ='A';	
			if(grd == 'A' || grd =='B') {				
				System.out.println("Passed the exam");			
			} else {
				System.out.println("Failed");	
			}
		
			
			switch (grd) {
				case 'A':
				case 'B': 
					System.out.println("passed the exam");
					break;
				
				default:
					System.out.println("failed the exam");
			}
			
			
			String US ="USA";
			
			if( US == "USA" || US =="America" || US =="US") {
				System.out.println("American");
			} else {
				System.out.println("Not American");
			}
			
			switch ( US ) {
				case "US":
				case "USA":
				case "America":
					System.out.println("American");
					break;
					
				default:
					System.out.println("Not Amrican");
			}
			
	    
	    
	    
	    
	    
	    
		
		
		

	}

}
