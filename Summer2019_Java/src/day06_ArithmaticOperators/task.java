package day06_ArithmaticOperators;

public class task {

	public static void main(String[] args) {
		
  /*  
    1.Write a Java program that will print a sum of two numbers
	  Please use variables to store num1,num2,and sum
	  Sample output:
	  46 + 90 = 136
  */
	
		int num1=46;
		int num2=90;
		int sum;
		sum=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+sum);
		
		
  /*
	2.Write a Java program to convert Fahrenheit to Celcius
      F=9*C/5+32
  */
		// celcius to fahrenheit
	double fahrenheit;
	
	double celcius=10;
	
	fahrenheit=(9*celcius/5)+32;
	
	System.out.println(celcius +" degree in fahrenheit is "+fahrenheit);
	
   /*
	 3.Write a Java program that converts mile to km 
	   1 mile = 1.609344 km  
   */
	
	
	double miles=100;
	double km;
	
	// 1 mile=1.609344 kilometers
	
	km=miles*1.609344;
	
	System.out.println(miles+" miles is "+km+" kilometers");
	
	
	
	
	           //  TASK
	
	   /*
		 1.Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas:
		   perimeter = 2 * radius * 휋 // PI 
		   area = radius * radius * 휋 // PI
	   */
	
	double radius=5.5;
	double perimeter, area;
	
	//perimeter=2*radius*Math.PI;
	
	perimeter=2*radius*3.14;
	
	area=radius*radius*3.14;
	
	System.out.println("The perimeter of a circle with the radius of "+radius+" is "+perimeter);
	System.out.println("The area of a circle with the radius of "+radius+" is "+area);
	
	
	
	   /*
	     2.Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
	      area = width * height 
	   */
	
	double width=4.5;
	double height=7.9;
	double area2;
	area2=width*height;
	
	System.out.println("The area of a rectangle with the width of "+width+" and the height of "+height +" is "+area2);
	
	
	
		
		
		
       /*
         3.Write a Java program that calculates the average of 3 numbers.
       */
		
	double n1,n2,n3;
	
	double average;
	
	n1=30;
	n2=45;
	n3=35;
	
	average=(n1+n2+n3)/3;
	
	System.out.println(average);
	
	    // Task-1
	
	int pies = 10,people = 4;
	double piesPerson;
	piesPerson = pies/people;
	System.out.println(piesPerson);  // 2.0
	
	    // Task-2 
	
	int pies2 = 10, people2 = 4;
	double piesPerson2;
	piesPerson2 = (double) pies2/people2;
	System.out.println(piesPerson2);     // 2.5
	
	   // Task-3
	
	int pies3 = 10, people3 = 4;
	double piesPerson3;
	piesPerson3 = pies/(double)people3;
	System.out.println(piesPerson3);     //2.5
	
	   // Task-4
	
	int pies4 = 10, people4 =4;
	double piesPerson4;
	piesPerson4 = (double) (pies4/people4);
	System.out.println(piesPerson4);        //2.0
	
                  // TASK
	//1.
	    int x =(int) 7.9;
	    int y =(int) 6.7;
	    System.out.println(x);    // 7
	    System.out.println(y);    // 6
	    
	    int a = (int) (7.9+6.7);
	    System.out.println(a);     // 14
	
	    double num = 17;
	    System.out.println(num);   // 17.0
	     
	    double b = 8+3;
	    System.out.println(b);     // 11.0
	
	    double c = (7)/2;
	    System.out.println(c);     // 3.0 
	
	    double d = (7/2);
	    System.out.println(d);      // 3.0
	
	    int num5 = (int) 7.8;
	    double num6 = (double) (15)/2;
       // sum = num5 + num6;	//////////
	
	}

	
	
	
}
