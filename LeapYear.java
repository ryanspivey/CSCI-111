	/*Course: CSCI 111, Section X
	 Student Name: Ryan Spivey
	 Student ID: 10635613
	 Programming Assignment: Homework 7
	 Due Date:	04/16/18
	 In keeping with the Honor Code of UM, I have neither given nor received assistance
	 from anyone other than the instructor.
	 Program Description:Determines if entered year is a leap-year using a user-defined method.
	*/
	
	import java.util.*;
	
	public class LeapYear{
		public static void main(String[] args){
			//variables
			Scanner scan= new Scanner(System.in);
			int year, exit=1;
			String entry, entryLowercased;
		
		
			System.out.print("Do you want to enter a year? yes/no (-1 to quit): ");
			entry=scan.nextLine();
			entryLowercased=entry.toLowerCase();
			
			//while loop to request for year and state answer
			while(exit>-1){
			
				if(entryLowercased.equals("yes")){
				System.out.print("Enter a 4-digit year: ");
				year=scan.nextInt();
				
					if(isLeap(year))
						System.out.println(year + " is a leap year.");
					else if(year==-1)
						break;
					else
						System.out.println(year + " is not a leap year.");
				} else
					exit=-1;
			}
		
		}
		
	
		//user-defined method
		public static boolean isLeap(int x){
		
			if((x %4 == 0) && (x %100 != 0))
				return true;
			else if ((x %400 == 0))
				return true;
			else 
				return false;
		}
	
	}