package mariya;

import java.util.Scanner;

public class AdvancedCalculator {
      static int num1,num2;
    
     
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    AdvancedCalculator obj = new AdvancedCalculator();
     
    System.out.print("Enter your first number: ");
	   num1 = sc.nextInt();
    System.out.print("Enter operator (+,-,*,/): ");
       String operator = sc.next();
    System.out.print("Enter your second number: ");
       num2 = sc.nextInt();
    
    if(operator.equals("+")) {
	 obj.sum();
    } else if (operator.equals("-")) {
   	 obj.substraction();

    }else if (operator.equals("*")) {
     obj.multiplication();
  	}else if (operator.equals("/")) {
     obj.division();
  	}
   
    
	}

	public void sum() {
		System.out.println(num1+num2);
	}
	 

	public void substraction() {
	
	 System.out.println(num1-num2);

	}

	public void multiplication() {
		System.out.println(num1*num2);

	}

	public void division() {
		System.out.println(num1/num2);

	}

	
}
