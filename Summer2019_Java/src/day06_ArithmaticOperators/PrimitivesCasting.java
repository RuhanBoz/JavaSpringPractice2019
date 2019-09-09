package day06_ArithmaticOperators;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		/*
		  casting: converting larger primitive to smaller size  
		           datatype variablename + (datatype) value
		  
		          castings: Explicit & Implicit
		
		  primitives: byte, short, int, long, folat, double
		 
		 */
		 
		 //EXPLICIT CASTING
		
		        int a = 10;
		        byte b = (byte) a;    // explicit casting
		
		        System.out.println(b);
		        
		        double  decimalNumber = 10.5; 
		        float floatNumber = (float) decimalNumber;          // double > float
		        
		        System.out.println(floatNumber);
		
		        long LongNum = 300L;
		        int intNum = (int) LongNum;
		        
		        System.out.println(intNum);
		
		 // IMPLICIT CASTING:
		        
		        byte ByteNum = 100;
		        int IntNum2 = ByteNum;
		           // same with:
		        int IntNum3 = (int) ByteNum;
		        
		        System.out.println(ByteNum);
		        
		        short ShortNum = 100;
		        long LongNum2 = ShortNum;
		           // same with:
		        long LongNum3 = (long) ShortNum;
		        
		 // explicit casting practices:
		        
                double LargestNumber = 100.8765;
                
                byte ByteValue =  (byte) LargestNumber;
                                                         // 100
                float FloatValue = (float) LargestNumber;
                                                         // 100.8765
                float FloatValue2 = (int) LargestNumber;
                float FloatValue3 = (byte) LargestNumber;
                                                         // 100
                float FloatValue4 = (short) LargestNumber;
                float FloatValue5 = (long) LargestNumber;
                
                System.out.println(FloatValue);
                
                float FloatNumber2 = 500.67f;
                
                int myNumber = (short) FloatNumber2;
                                                    // 500
                System.out.println(myNumber);
                
               /*   
                int Num1 = 100;
                int Num2 = 200;
                int Num3 = 300;
                */
	
	            int Num1 = 100 , Num2 = 200 , Num3 = 300;  
	            
	            //LOCAL VARIABLES:
	            
	            boolean  result;
	        //    System.out.println(result); : // LOCAL VARIABLES MUST BE INITIALIZED
                
	            
	            char Character1 ;
	       //     System.out.println(Character1);
                
                boolean result1,
                        result2,
                        result3;
	         
         //       System.out.println(result1);
                
                
                
                
                
                
                
	}
	
	

}
