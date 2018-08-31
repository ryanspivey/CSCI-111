import java.util.*;
public class TwodArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int rowsize, colsize; 
		
		//requests array size #
		System.out.print("Enter number of rows within your array: ");
		rowsize= scan.nextInt();
		
		System.out.print("Enter number of columns within your array: ");
		colsize= scan.nextInt();
		
		int[][] twod=new int [rowsize][colsize];
		
		//fills array
		for(int row = 0; row < twod.length; row++) {
			for(int col=0; col < twod[0].length; col++) {
				twod[row][col]=2;
			}
		}
		
		System.out.print("Your sum is: " + (sumArray(twod)));

	}
	
	//method for summing array
	public static int sumArray(int[][]array) {
		int total = 0;
		
		for(int row = 0; row < array.length; row++) {
			for(int col=0; col < array[0].length; col++) {
				total += array[row][col];
			}
		}
		return total;
	}

}
