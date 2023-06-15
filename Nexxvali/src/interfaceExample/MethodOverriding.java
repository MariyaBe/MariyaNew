package interfaceExample;

public class MethodOverriding extends MethodOverloading{

	public static void main(String[] args) {

	}
	void add(int a,int b) {
		super.add(30, 30);
		System.out.println("This is MethodOverriding add method : " + (a+b));
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void sub (int a, int b) {
		super.sub(50, 35);
		System.out.println("This is from overriding substract method : " + (a-b));
	}
}

