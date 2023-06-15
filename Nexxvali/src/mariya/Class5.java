package mariya;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
		
		System.out.print("Calculator\n\nEnter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		
		
		System.out.println("The sum is: " +(num1 + num2 + num3) );
		
		
	  if(num1 > 20)	{
		  
		System.out.println("your first number is bigger than 20!"); 
		
	  }
	  else {
		  
		  System.out.println("your first number is smaller than 20!!");
	  }  
		
	}

}
