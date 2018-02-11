//this program asks the user for his/her age
import java.util.Scanner;
	public class Age {
     
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String Name;
        int age;
        System.out.println(" please  enter your name");
        Name=input.next();
        System.out.println("please enter your age");
        age=input.nextInt();
        System.out.print("Your name is " + Name + " and your age is "+age);
         
         
    }
}
