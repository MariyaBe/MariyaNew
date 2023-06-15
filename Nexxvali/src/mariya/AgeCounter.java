package mariya;

import java.util.Scanner;

public class AgeCounter {
// Show "Invalid input" error for birth year 2022 or higher.
// Show "Congratulation" message if Age is 100 or more.
// Run the program 5 times.		
	public static void main(String[] args) {
		
	//	int count = 0;
		
		for(int i=0; i <=3; i++) {
			Scanner SC = new Scanner(System.in);

			System.out.print(i+" Enter your birth year : ");
		int year = SC.nextInt();
		
		int age = 2022 - year;
		 	
		if(age<=0) {
			System.out.println("invalid input" );
			
		}else if(age>=100) {
			System.out.println("Congratulations! Your age is " +age);
			} else if (age>0){
				System.out.println("your age is : " + age);
			}
		}
		
			System.out.println("GAME OVER! ");
		
		}
	}


