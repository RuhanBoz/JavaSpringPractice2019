package Practices;
import java.util.Scanner;


public class selfStudy1 {

	public static void main(String[] args) {

		
		
		// convert seconds into hours, minutes and seconds
		
		// 1 hr=3600 seconds, 1 min= 60 min
		int inputSeconds, hours,minutes, seconds;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter seconds:");
		
		inputSeconds=input.nextInt();
		
		hours=inputSeconds/3600;  // input- 3700
		
	
		inputSeconds%=3600; // inputSeconds=inputSeconds%3600;
		
		
		minutes=inputSeconds/60;
		
		inputSeconds %=60;

		seconds=inputSeconds;
		
		System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	
		
		
	}


