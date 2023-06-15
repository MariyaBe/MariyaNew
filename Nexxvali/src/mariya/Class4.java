package mariya;

import java.util.Scanner;

public class Class4 {
	
	//MAD LIB game by Mariya 

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in );
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Hey " + name +"! Welcome to my MAD LIB game"
				+ ". Please enter your age: ");
		 
		String age = sc.nextLine();
		
		System.out.print("Please enter your country: ");
		
		String country = sc.nextLine();
		
		
		System.out.println("Hi, my name is " + name + ". I am " + age + 
		" years old and I am from " + country + "."	);
		
	}

}
