package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter a Number: ");
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
