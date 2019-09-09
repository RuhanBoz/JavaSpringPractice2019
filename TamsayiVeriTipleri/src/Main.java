
 public class Main {

	public static void main(String[] args) {
		
   int a = 4;
   System.out.println(Integer.MAX_VALUE);
   System.out.println(Integer.MIN_VALUE);
	
	byte b = 100;
	System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
	
	short c = 150;
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);
	
	long d = 1000;
	System.out.println(Long.MAX_VALUE);
	System.out.println(Long.MIN_VALUE);
	
	    // BYTE --> SHORT --> INT --> LONG 
	
	short j = 1000;
	int i = (j/2);
	System.out.println(i);
	
	short r = 100;
	byte s = 2;
	int t = 4;
	long v = r + s + t;
	System.out.println(v);
	
	
	 double e = 5.25;
	 double f = 4.0;
	 double g = 4d;
	 double h = 4.23d;
	System.out.println(g);
	
	 float k = (float) 5.0;
	 float l = 5f;
	 float m = 5.2f;
	System.out.println(m);
	
	 int n = 22 / 7;
	 float p = 22f / 7f;
	 double y = 22d / 7d;
	System.out.println("n:"+n);
	System.out.println("p:"+p);
	System.out.println("y:"+y);
	
	int o = 5;
	float z = o;
	System.out.println(z);
	
	double sayi1 = 70.25;
	double sayi2 = 60d;
	double sayi3 = 80.2;
	
	System.out.println("Ortalama:"+(sayi1 + sayi2 + sayi3) / 3);
	
	float q = 70.25f;
	float x = 60f;
	float u = 80.2f;
	System.out.println("Ortalama:"+(q + x + u) / 3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
