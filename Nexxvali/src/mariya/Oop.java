package mariya;

import java.util.Scanner;

public class Oop {
   
	static String var = "Blue";
	String val = "Blue";
	static short hp = 4000;
	static byte wheelNum = 8;
	
	
	public static void main(String[] args) {
		
		Oop vcl = new Oop();
	    Oop.truck();
	
		vcl.car();
		vcl.bus();
		vcl.train();
		vcl.experiment();
		vcl.Calculater();
	}

	
    public void car () {      
        System.out.println("My car color is " + val);		
    }  
   
    public static void truck() {
        System.out.println("My truck horsepower is " + hp);
    			
    }
      
    public void bus() {
        System.out.println("Bus has " + wheelNum + " wheels.");
    	
    }
    
    
    public void train() {
    	int price = 200000;
       System.out.println("A train cost " + price);
        	 	
    }
   
    public void experiment() {
    	float ft = 1.1234568785455f;
    	double db = 1.12345689;
        System.out.println("Bus has " + ft +  " wheel." + db);
    	
    }
    public void Calculater() {
        Scanner sc = new Scanner(System.in);	
		
		System.out.print("Calculator\n\nEnter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		
		
		System.out.println("The sum is: " +(num1 + num2 + num3) );
    	
    }
    
    }
	

