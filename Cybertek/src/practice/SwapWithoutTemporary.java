package practice;

public class SwapWithoutTemporary {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		
        System.out.println("a nin swap dan onceki degeri "+a);
		
		System.out.println("b nin swaptan onceki degeri "+b);
		
		a=a+b; // a= 5+7=12
		
		b=a-b; // b= 12-7=5
		
		a=a-b; // a=12-5=7
		

		System.out.println("a nin swapdan sonraki degeri "+a);
		
		System.out.println("b nin swapdan sonraki degeri  "+b);
		
		
		

	}

}
