package exceptionHandling;

public class Finally {

	public static void main(String[] args) {

		
		try{ int a = 1/0;
		System.out.println(a);
			
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Inside the finally block");
		}
	}

}
