	//This program requests the user's name and repeats it back:)
	import java.util.Scanner;
	
	public class Name{
		public static void main(String[]args){
			String name;
			Scanner input=new Scanner(System.in);
			System.out.print("What is your name? ");
			name = input.next();
			System.out.println("Your name is " + name + "!");
		}
	}