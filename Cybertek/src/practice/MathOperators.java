package practice;

public class MathOperators {

	public static void main(String[] args) {

		// + add , - subtract , * multiply , / divide , % module

		int a = 7;
		int b = 2;

		System.out.println(a + b); // sum : toplam prints 9

		System.out.println(a - b); // difference : fark prints 5

		System.out.println(a * b);// product : carpim sonucu prints 14
		
		System.out.println(a / b); // quotient :  prints 3
		
		System.out.println(a%b); // remainder : bolme isleminde kalan prints 1

		int c=19;
		int d=10;
		
		int sum, difference,product, quotient, module;
		
		sum=c+d;
		difference=c-d;
		
		product=c*d;
		
		quotient=c/d;
		module=c%d;
		
		System.out.println("The sum of "+ c +" and " +d +" is: "+sum);
		
		System.out.println("The difference of "+ c +" and " +d +" is: "+difference);
		
		System.out.println("The product of "+c + " and " +d +" is: "+product);
		
		System.out.println("The quotient of "+c + " and " +d + " is: "+quotient);
		
		System.out.println("The remainder of "+c + " and " +d + " is: "+module);
		
		//  / division with double and int values
		int num1=5;
		int num2=2;
		
		System.out.println(num1/num2);
		
		System.out.println(num1%num2);
		
		
		
	}

}
