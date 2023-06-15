package exceptionHandling;

public class Throw1 {

	public static void main(String[] args) throws Exception {

		
		int age=17;
		
		
		if(age<18) { throw new Exception("not eligible for voting");
		
	
		}else {
			System.out.println("eligible for voting");
		}
		
	}

}
