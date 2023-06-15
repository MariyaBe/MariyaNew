package inheritance;

public class ClassC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//classname name = new classname();
		Class1 obj1 = new Class1();
		Class2 obj2 = new Class2();
		D obj = new D();
		obj.add(10, 200);
		obj.sub(500, 350);
		obj.multiply(3, 3);
		obj1.main(args);
		obj2.division(15, 3);
		
	}
	
}
 class A{
	 
	 void add(int val1, int val2 ) {
		System.out.println(val1+val2);
		
	 }
	 
 }
 class B extends A{
	   public void sub(int val1, int val2) {
		   System.out.println(val1-val2);
		   
	   }
 }
  class D extends B{
	  
	  void multiply(int val1, int val2) {
		    System.out.println(val1*val2);
	  }
  }

		
		
	
	
	
	
 

