package exceptionHandling;

public class Throw {

	public static void main(String[] args) throws Exception {
		Throw t = new Throw();
		
		t.method1();
		t.method2();
	   }
		
	

public void method1() throws Exception {	
/*if there is a exception in the first method after using throws
	it will show exception and not going to print the other method.
	if my 2nd code has a exception then first code will run then throw
	the exception*/
	
	
try {
	int a =7/0 ;
	System.out.println("Method 1 result: " +a);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
void method2() {
	
	int b= 10/2;
	System.out.println("Method 2 result: " +b);
}

}


