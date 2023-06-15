package mariya;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {

		AdvancedCalculator ac = new AdvancedCalculator();
		AgeCounter agc = new AgeCounter();
		GessingGame gg = new GessingGame();
		
		for(int i=0; i<5;i++) {
			Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for calculator, 2 for age, 3 for guessing game "); 
		 int input = sc.nextInt();

		if(input==1) {
			ac.main(args);
		} else if (input==2) {
			agc.main(args);
		}else if(input==3) {
			gg.main(args);
		}else {
			System.out.println("Invalid entry");
		}
		 
	
	}

	}	
		
		
	}


