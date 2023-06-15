package interfaceExample;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
		ob.add(10, 10);
		ob.add(10, 10, 10);
		ob.add(10, 200, 10f);
		ob.sub(30, 10);
		
	}

	void add(int a,int b) {
		System.out.println("This is from MethodOverloading add method : " + (a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int a, int b,float c) {
		System.out.println(a+b+c);
	}
	void sub (int a, int b) {
		System.out.println("This is from overloading substract method : " + (a-b));
	}
}



 

