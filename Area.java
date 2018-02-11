//This program gives the area of a circle
	import java.util.Scanner;
	public class Area{
	public static void main(String[]args){
	//variable declaration
	int r;
	double pi=3.14, area;
	Scanner input=new Scanner(System.in);
	System.out.print("What is the radius of the circle? ");
	r=input.nextInt();
	area = pi * r * r;
	System.out.println("The area is " + area);
	}
}
