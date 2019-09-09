package day14_Scanner;

public class warmUpTask {

	public static void main(String[] args) {
	 
		
		/*
		 1. write a program that can display the days
		 		if the day is Monday or Tuesday:
								Java class days

				if the day is Thursday or Friday:
								Selenium class days

				if the day is Wednesday or saturday:
								SQL class days

				otherwise: day off
					(DO NOT use if statement) 
		 */
		
			
			String day  ="Friday";
			
			switch (day) {
				case "Monday":		
				case "Tuesday":
						System.out.println("Java class");
						break;
						
				case "Wednesday":
				case "Saturday":
						System.out.println("SQL");
						break;
					
				case "Friday":			
				case "Thursday":
						System.out.println("Selenium");
						break;
									
				default:
					System.out.println("Day off");
			
			}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
