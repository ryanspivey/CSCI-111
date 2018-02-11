	//this program requests the user's age and repeats it back via console.
	import java.util.Scanner;

	public class Age1{
		public static void main(String[]args){
			Scanner input=new Scanner(System.in);
			int age;
			System.out.print("What is your age? :");
			age=input.nextInt();
			System.out.println("You are " + age + " years old!");
		}
	}