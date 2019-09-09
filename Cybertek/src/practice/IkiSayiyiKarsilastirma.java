package practice;

public class IkiSayiyiKarsilastirma {

	public static void main(String[] args) {
		
		double n1=12.5;
		double n2=5;
		
		if (n1==n2) {
			System.out.println("sayilar esittir");
		}
		
		else if (n1<n2) {
			System.out.println(n2+" daha buyuktur");
		}
		
		else {  // else if (n1>n2) ile ayni sey demek .
			System.out.println(n1+" daha buyuktur");
		}
	}

}
