package practice;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int a=5;
		
		
	// a nin degerini 1 nasil artirirsin
		
		System.out.println("Artirmadan once a nin degeri: "+a);
		
		
		a=a+1; // bunun yerine daha iyi olan incerement kullanilir a++
		
		System.out.println("Artirdiktan sonra a nin degeri: "+a);
		
		int b=12;
		
		System.out.println("Artirmadan once b nin degeri: "+b);
		
		//b++; // increment
		
		b++;  // bu b=b+1 lla ayni sey
		
		
		System.out.println(b);
		
// decrement  azaltma  operatoru b--;
		
		
		int c=7;
		
		System.out.println("Azaltmadan once c nin degeri "+c);
		
	
		c--; // bu c=c-1 ile ayni sey demektir. Buna post decrement denir.
		
		System.out.println("Azaltmadan sonra c nin degeri: "+c );
		
	
		
		
	}
	

}
