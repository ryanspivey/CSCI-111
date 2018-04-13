import java.util.*;

public class MethodTest5{
    
    
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        String entry;

        System.out.print("Enter a string: ");
        entry=scan.next();

        System.out.println("That string reversed is " + reverso(entry));


    }

    public static String reverso(String toBeReversed){
    String reverse = "";
    int length = toBeReversed.length();

    for ( int i = length - 1 ; i >= 0 ; i-- ){
     reverse = reverse + toBeReversed.charAt(i);
    }
    return reverse;
    }




}