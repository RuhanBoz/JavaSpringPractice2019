package day05_Recap;

public class Concatenation {

	    /*
	      STRING: Represents the sequences of characters,used for storing text
	              string values are surrendered by a double quote
	     
	      Concatenation: combining, linking things together  ==> creates a String value
	                     achieved by using + operator
	                     we can concatenate any value to String
	      
	     */
	public static void main(String[] args) {
		
		    String str = "any text goes here";
		    System.out.println(str);
		    
		    String str2 = "1";
		    System.out.println(str2);
         
		    System.out.println("Hello World");
		    
		    String Hello = "Hello World";
		    System.out.println(Hello);
		    
		    String myName = "Cybertek" + "School";
		    System.out.println(myName);
		
            String year = "This is " + 2019;
		 
            //examples:
            
            String name = "Ruhan";
		    System.out.println("My Name is " +name);
		    
		    /*
		      cucumber is 3$
		      tomato is 5$ 
		   */
                int cucumber = 3; int tomato = 5;
                System.out.println("cucumber is "+'$' + cucumber);    //"cucumber is $3
                System.out.println("tomato is " +'$' + tomato);       // tomato is $5
                
                String newStr = "100"+10;
		        System.out.println(newStr);                          // 10010
		        
		        System.out.println( 1 + 2 + 3 );                     //6
		        System.out.println( "1"+2 +3 );                      // "12"+3 ==>123
		    
		  //    System.out.println("1"+1-3);     // "11"-3
		        
		        System.out.println("Batch 12"+1 + 2);        // "Batch 121"+2 ==>Batch 1212
		        
		       System.out.println(2-1+1+"4");                //24
		        
		       System.out.println( "Batch 12" + (1+2) );    // Batch 123
		        
		       System.out.println( 1 + "123" + 4 + 5 );     // 112345
		       
		       
		       System.out.println("123"+ (4+5) );           // 1239
				
				
				System.out.println(1 + ( "1"+2 ) ) ;        //112
					               // 1 +  "12"  =>112
				
				System.out.println( 1 + "123" + ( 4 + 5 )  );
				                                             //	"1123" + 9  ==> 11239
				
				
				System.out.println( 4 + 3 - (9+3) );
				                                    // 7 - 12	  
				
				System.out.println( (1+2) + "3" );
				                                  //  33
				
				String BookName = " I like the book called \' Game of throne \'";
				System.out.println(BookName);
				
				
				String MyInfo = "My Name is: \tCybertek";
				System.out.println(MyInfo);
				
				System.out.println( '3' + 3 );
					//				51 + 3 ==> 54
				
				System.out.println( "3" + 3 );      // 33
				
				System.out.println("3"+'3'); 
				                               //	"3" +3 	
					                        //  if we concatenate char to String, char is concatenated as character
				                             //	 "3"+3
				
				System.out.println( 12 + '3');
					                          // 12+  51 =63
				                            // if we concatenate char to number, representative number of char will be concatenated
				
				System.out.println( 2 + 3 );    //5
				System.out.println( "2"+3 );
				
				System.out.println( '7'+3 );
			                             	//	 55 +3
				
				System.out.println('7' + 9);
				                            //	55 +9
				    
		    }

}
