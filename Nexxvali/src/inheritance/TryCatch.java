package inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter a Number: ");
		
		double num = sc.nextDouble();
		
		System.out.println(num);
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}


