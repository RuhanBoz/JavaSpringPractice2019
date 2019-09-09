package practice;

public class EvenOddNumberTest {

	public static void main(String[] args) {

		
		// even : cift sayi; odd : tek sayi
		
		int num=38;
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		
		else if (num%2!=0) { /// else {   }  else den sonra condition yazilmaz
			System.out.println(num+" is odd");
		}
		
	}

}
