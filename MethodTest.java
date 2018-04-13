import java.util.Scanner;

public class MethodTest{
  
	//main method
    public static void main(String[] args){
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter mass: ");
    double m = scan.nextDouble();
    System.out.println("Enter velocity: ");
    double v = scan.nextDouble();
    
    double k = kinetic(m,v);
      System.out.println("The kinetic energy is " + k);
  }
  
  //user-defined method
  public static double kinetic(double mass, double velocity){
   double ke = 0.5 * mass * Math.pow(velocity, 2);
    return ke;
    
  }

}
