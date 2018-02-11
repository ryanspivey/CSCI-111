//program: simple calculator-- capable of solving addition, subtraction, division, & multiplication
import java.util.Scanner;
	
class Calculator{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		String user_action;
		double first_num, second_num, answer;
		
		
		System.out.print("Calculator ready! Please enter first number: ");
		first_num = input.nextDouble();
		System.out.print("Calculator ready! Please enter second number: ");
		second_num = input.nextDouble();
		System.out.print("Would you like to perform addition, subtraction, multiplication, or division?");
		user_action=input.next();
		
		if (user_action.matches("addition")){
			answer=first_num+second_num;
			System.out.println(first_num + " + " + second_num + " = " + answer);
		}
		if (user_action.matches("subtraction")){
			answer=first_num-second_num;
			System.out.println(first_num + " - " + second_num + " = " + answer);
		}
		if (user_action.matches("multiplication")){
			answer=first_num*second_num;
			System.out.println(first_num + " * " + second_num + " = " + answer);
		}
		if (user_action.matches("division")){
			answer=first_num/second_num;
			System.out.println(first_num + " / " + second_num + " = " + answer);
		}		
	}
}