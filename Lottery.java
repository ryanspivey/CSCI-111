import java.util.*;
public class Lottery{
	public static void main(String[]args){
/* Var Declaration
num:   0,1,2: User input for lotto numbers
lotto: 0,1,2: Randomly generated lotto numbers
*/
	int num0,num1,num2,lotto0,lotto1,lotto2;
	Scanner input=new Scanner(System.in);
	Random rando=new Random();

//request user for lottery entry
	System.out.print("Enter your first lottery number between 1 and 10: ");
	num0=input.nextInt();
	System.out.print("Enter your first lottery number between 11 and 20: ");
	num1=input.nextInt();
	System.out.print("Enter your first lottery number between 21 and 30: ");
	num2=input.nextInt();

//random number generation
	lotto0=1  + rando.nextInt(10);
	lotto1=11 + rando.nextInt(10);
	lotto2=21 + rando.nextInt(10);

	System.out.printf("The lottery numbers were %d, %d, & %d.\n", lotto0,lotto1,lotto2);

//method for verifying user's entry as valid & determining win/loss
if (num0 < 0) {
    System.out.println("Your lottery numbers are not in the correct range!");
	
} else if (num0 > 10) {
    System.out.println("Your lottery numbers are not in the correct range!");
	
	} else if (num1 < 11  ) {
		System.out.println("Your lottery numbers are not in the correct range!");
		
		} else if (num1 > 20) {
			System.out.println("Your lottery numbers are not in the correct range!");
			
			} else if (num2 < 21) {
				System.out.println("Your lottery numbers are not in the correct range!");
				
				} else if (num2 > 30) {
					System.out.println("Your lottery numbers are not in the correct range!");
					
					} else if (num0 == lotto0 && num1 == lotto1 && num2 == lotto2){
						System.out.println("You won $1000!");
						
						} else if (num0 == lotto0 && num1 == lotto1){
							System.out.println("You won $100!");
							
							} else if (num1 == lotto1 && num2 == lotto2){
								System.out.println("You won $100!");
								
								} else if (num0 == lotto0 && num2 == lotto2){
									System.out.println("You won $100!");
									
									} else if (num0 == lotto0){
										System.out.println("You won $100!");
										
										} else if (num1 == lotto1){
											System.out.println("You won $100!");
											
											} else if (num2 == lotto2){
												System.out.println("You won $100!");
												
												} else{
													System.out.println("You lose!");
}
	

System.exit(0);
}
}