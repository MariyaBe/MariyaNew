package abstractExample;

public class Abstract extends classAA{

	public void method1() {
		System.out.println("We have to use inheritence for abstract method"
						+ "we have to create body for abstract method inside calling class");
	}

	public static void main(String[] args) {
		Abstract ab = new Abstract();
		
		ab.method();
		ab.method1();
		
	}

}

	abstract class classAA{
	
	public void method() {
		System.out.println("inside non abstract method" 
	+ "we can use abstract and non abstract method inside a abtract class ");
	}
	//we don't need body for abstract method
	abstract void method1();
	
	
}




