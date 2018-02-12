//this program can find x & y intercept of a linear equation
import java.util.Scanner;

public class Xyintercept{
	public static void main(String[]args){
	/*Variable declaration
	x_input
	y_input
	equals_input
	x_input_mf
	y_input_mf
	*/
	double x_input, y_input, equals_input, x_input_mf, y_input_mf;
	Scanner input=new Scanner(System.in);
	System.out.println("_x + _y = _");
	System.out.print("Please enter x input: ");
	x_input=input.nextDouble();
	System.out.print("Please enter y input: ");
	y_input=input.nextDouble();
	System.out.print("Please enter 'equals' input: ");
	equals_input=input.nextDouble();
	System.out.println(x_input + "x + " + y_input + "y = " + equals_input);
	//LOGIC
	x_input_mf= equals_input/x_input;
	y_input_mf= equals_input/y_input;
	
	System.out.printf(" X-Intercept is (%.2f,0)",x_input_mf);
	System.out.println("");
	System.out.printf(" Y-Intercept is (0,%.2f)",y_input_mf);	
	
	}

}
	