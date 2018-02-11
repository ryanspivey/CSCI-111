//this program defines the fibonacci sequence
import javax.swing.JOptionPane;

public class Fibonacci{
public static void main(String[]args){
	
	/*Formula = (((1+Sqrt(5))^n) - ((1-Sqrt(5))^n))/Sqrt(5)
	n1= (1+Sqrt(5))^n
	n2= (1-Sqrt(5))^n
	*/
	/*Variable Declaration
	ns= String version of user input
	n = fibonacci term number 
	n1 = first portion of formula
	n2 = second portion of formula
	n3 = first portion of formula raised to Nth
	n4 = second portion of formula raised to Nth
	*/
	String ns;
	double n,n1,n2,n3,n4,answer;
	ns = JOptionPane.showInputDialog(null, "Enter n term value of Fibonacci sequence");
	n= Double.parseDouble(ns);
	//Logic
	n1=(((1+Math.sqrt(5))/2));
	n2=(((1-Math.sqrt(5))/2));
	n3=Math.pow(n1,n);
	n4=Math.pow(n2,n);
	answer = (n3-n4)/Math.sqrt(5);
	//Print--Success:)
	System.out.printf("The value corresponding to the n value you entered is %.0f (in the fibonacci sequence)", answer);
	
	}
}