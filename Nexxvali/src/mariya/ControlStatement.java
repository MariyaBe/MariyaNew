package mariya;

import java.util.Scanner;

public class ControlStatement {
	

static {
	System.out.println("Find CONTROL STATEMENTS  below : ");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ControlStatement.controlStatement1();
		ControlStatement.controlStatement2();
		
		ControlStatement obj = new ControlStatement();
		obj.controlStatement3();
		obj.controlStatement4();
	}

	public static void controlStatement1 () {
		
		 int var = 1;
		while(var<=10) {
			System.out.println("Odd numbers :" + var);
			var+=2;
		}
	}

	public void controlStatement3() {
		
		int var = 50;
		do {
		System.out.println("Method 3 value is : " + var);
			var++;
		} while(var<= 60); 
						
	}
	 
	
	public static void controlStatement2() {
		
		for(int i = 0;  i<=10; i++) {
				System.out.println("Even numbers :" + i);
				}		
		
	}
		
	public void controlStatement4() {
		
		int var = 11;
		switch(var) {
		
		case 10: 
			System.out.println("The value is 10 ");
			break;
		
		case 9: 
			System.out.println("The value is 9 ");
			break;

		case 8:
			System.out.println("The value is 8 ");
		break;
		
		default: 
			System.out.println("The value is invalid ");
			break;
		}
		
		
		
	}
	
	
}
