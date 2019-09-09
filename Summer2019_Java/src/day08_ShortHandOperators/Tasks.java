package day08_ShortHandOperators;

public class Tasks {

	public static void main(String[] args) {
		
		   int ApplesCount = 20;
		   int 	OrangesCount = 30;
		   int PearsCount = 30;
		   
		   boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		                      //20    <     30       ||    30        >=    30
		   System.out.println(comp); // true
		   
		   String OutsideWeather;
		   int Degree;
		   OutsideWeather = "Shinny";
		   Degree = 70;
		   boolean comp2 = ( ! (OutsideWeather=="Rainy"||Degree==70));
		                 //   !     Shinny    == Rainy || 70   ==70
		   System.out.println(comp2);
		
		
		
		   int b = 2;
		   boolean res = ++b == 2 || --b == 2 && --b ==2;
		   
		   System.out.println(res);      // false
		

		   boolean x = true, z = true;
		   int y = 20;
		   x = (y==10)||(z==false);
		   
		   System.out.println(x);  // true
		   
 
		   int num1=7;
		   int num2=10;
		   System.out.println("\"First number "+num1+" is greater than second number "+num2 +"\t-"+ (num1>num2)+"\"");
		   
	}

}
