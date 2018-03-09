import java.util.Scanner;

class SplitCalandar{
    public static void main(String args[]){
		String entry, wordone, wordtwo;
		int index, length, word2;
		Scanner input=new Scanner(System.in);
		
			System.out.println("Please enter month and day eg.(03/22)");
			entry=input.nextLine();
		
		/************************************
		find length of entered string so that
		an integer number can be used for end 
		reference in indexOf method.
		*************************************/
			length=entry.length();
		
		/************************************
		wordone/two is string being defined
		from str(entry) based on start and 
		finish point. IndexOf finds the
		first occurrence of a specific 
		char
		*************************************/
			wordone= entry.substring(0,entry.indexOf("/"));
			wordtwo= entry.substring(entry.indexOf(wordone)+ 3 ,length);
		
		
		//if method for determining month name based on string entered
		if (wordone.equals("01")){
			System.out.println("January " + wordtwo);
		} 
		else if (wordone.equals("02")){
			System.out.println("February " + wordtwo);
		} 
		else if (wordone.equals("03")){
			System.out.println("March " + wordtwo);
		} 
		else if (wordone.equals("04")){
			System.out.println("April " + wordtwo);
		} 
		else if (wordone.equals("05")){
			System.out.println("May " + wordtwo);
		} 
		else if (wordone.equals("06")){
			System.out.println("June " + wordtwo);
		} 
		else if (wordone.equals("07")){
			System.out.println("July " + wordtwo);
		} 
		else if (wordone.equals("08")){
			System.out.println("August " + wordtwo);
		} 
		else if (wordone.equals("09")){
			System.out.println("September " + wordtwo);
		} 
		else if (wordone.equals("10")){
			System.out.println("October " + wordtwo);
		} 
		else if (wordone.equals("11")){
			System.out.println("November " + wordtwo);
		} 
		else if (wordone.equals("12")){
			System.out.println("December " + wordtwo);
		}
		
	
		
		
		
	}
}
