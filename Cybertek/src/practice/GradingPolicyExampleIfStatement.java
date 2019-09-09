package practice;

public class GradingPolicyExampleIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
		
	int grade=15;
	
	if (grade<25) {
		System.out.println("F");
	}
	
	else if (grade<45) {
		System.out.println("E");
	}
	
	else if ( grade<50) {
		System.out.println("D");
	}
		
	else if (grade<60) {
		System.out.println("C");
	}
		
	else if (grade<80) {
		System.out.println("B");
	}
		
	else   {
		
		System.out.println("A");
	}
		
		
	}

}
