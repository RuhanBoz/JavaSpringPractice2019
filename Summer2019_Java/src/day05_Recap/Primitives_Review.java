package day05_Recap;

public class Primitives_Review {

	/*
	     Primitives:
	                byte:only takes whole numbers
	                short:only takes whole numbers
	                int:only takes whole numbers
	                long:only takes whole numbers
	                
	                float:can take decimals(must have F or f at the end)
	                double:can take decimals
	                
	                boolean:true or false boolean expressions
	                char:character within single quote ''
	                     also takes number
	  
	 */	
	public static void main(String[] args) {
		
		   byte bNum=127;
		        // byte range : -128 to 127
		        // byte bNum2=126.5;       //byte only takes whole number 
		   
		   short sNum2=1000;
		        // short sNum=126.5;               //short only takes whole number
		
		//bNum = sNum2;   // short is greater tham byte
		   
		   sNum2 = bNum;
		   System.out.println(sNum2);
		
		   int intNum=100;
		//   int intNum2=100.5;         int takes whole numbers
		// byte ByteNum = intNum;    int > byte
		   
		   short shortNum2 = 105;
		   intNum = shortNum2;

	       System.out.println(intNum);  //105
	
	       long longNum = 100l;
	       long longNum2 = 100L;
	       
	  //     byte ByteNum3 = LongNum;   
	  //     short ShortNum4 = 100l;
	  //     int IntNum3 = 100L;        long > int, byte, short
	       
	       byte a=10;
	       int  b=30;
	       short c=40;
	       
	       long LongNumber = a;
	       long LongNumber2= b;
	       long LongNumber3= c;
	       
	       
	       float floatNumber = 10.5f;
	       float floatNumber2= 20.5F;
	       
	       short a1 = 10;   byte b1 =20;  long c1= 30;  int d1= 40;
	       
	       float Floats = a1;
	       float Floats2= b1;
	       float Floats3= c1;
	       float Floats4= d1;
	       
	       System.out.println(Floats);
	       
	       
	       double DoubleNum1= 10L;       //long is smaller than double
	       double DoubleNum2= 10.5F;
	       
	       
           boolean result=  true;
           boolean result2= false;
           
           boolean result3= 9>10;
            System.out.println(result3);
	       
	       
	       char character1= 'A';
	       System.out.println(character1);    // characacter: A
	       
	     // char character2= A;
	     // char character3= 'AA'   only a single character can be decimal
	       
	       // all the characters have representive number:
	       
	       char charvalue = 98;
	       System.out.println(charvalue);      // character.
	       
	       int num3 = 'B';
	       System.out.println(num3);   //66
	       
	       float fnum = 'B';           
	       System.out.println(fnum);   //66.0
	       
	       byte bvalue = 'B';
	       System.out.println(bvalue);    //66
	      
	       float fnum2 = 5.5F;
	       float fnum3 = 5;
	       System.out.println(fnum2);         //5.5
	       System.out.println(fnum3);         //5.0
	       
	       char specialCharacter = 55000;
	       System.out.println(specialCharacter);
	
	        //PRACTISES
	       
	       /*
	         8, 9, #, @, 8.5, 5.5F, 128, 40000, 9>10, true, false
	        
	        */
	       
	       byte Bnum=8; short SNum = 8; int INum = 8; long LNum= 8L; float FNum = 8f; double DNum=8; char character= '8';
	
	       System.out.println(Bnum);            //8
	       System.out.println(SNum);            //8
	       System.out.println(INum);            //8
	       System.out.println(LNum);            //8
	       System.out.println(FNum);            //8.0
	       System.out.println(DNum);            //8.0
	       System.out.println(character);       //8   .
	
	           // # & @:
	       
	       char character2 = '#'; 
	       char character3 = '@';
	       System.out.println(character2);
	       System.out.println(character3);
	
	
	}

}
