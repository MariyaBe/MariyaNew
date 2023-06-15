package mariya;

import java.util.Scanner;

public class GessingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String guess = "";
		String secretWord = "Mariya";
		int guessCount = 0;
		int guessLimit = 5;
		boolean outOfGuess = false;
		
		while(!guess.equalsIgnoreCase(secretWord) && !outOfGuess ) {
			
			if(guessCount<guessLimit) {
			System.out.print("Enter a guess word (attempt remaining "+(guessLimit-guessCount)+ "): ");
				guess = sc.nextLine();
				guessCount++;
				
			} else {
				outOfGuess = true;
			}
		
			if(outOfGuess) {
			 System.out.println("You lose! No more attempt!");
			} else if (guess.equalsIgnoreCase(secretWord)) { 
			 System.out.println("YEAH! YOU GOT IT!!");

				
			}else {
			 System.out.println("Oops!! Wrong guess ");
			}
			
		}
		 
		
	}

}
