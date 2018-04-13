import java.util.*;
    public class MethodTest2{
    
        public static void main(String [] args){
           Scanner scan=new Scanner(System.in);
           System.out.print("Enter your base integer: ");
           int a= scan.nextInt();
           System.out.print("Enter your exponent integer: ");
           int b= scan.nextInt();
           
            System.out.println(pow(a,b));

            }
    
        public static int pow(int base, int power){
            if(power == 0) return 1;
            return base * pow(base, --power);
        }
    
    
    }