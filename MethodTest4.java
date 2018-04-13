import java.util.*;

public class MethodTest4{

public static void main(String [] args){
    Scanner scan=new Scanner(System.in);

    System.out.print("Enter x: ");
    int x= scan.nextInt();
    System.out.print("\nEnter y: ");
    int y= scan.nextInt();

    if(x <= y)
        System.out.println(x + " + " + y + " = " + sum(x,y));
    else 
        System.out.println(x + " - " + y + " = " + difference(x,y));

    }

    public static int sum(int x, int y){
        int solution= x+y;
        return solution;
    }
    public static int difference(int x, int y){
        int solution= x-y;
        return solution;
    }

    }
