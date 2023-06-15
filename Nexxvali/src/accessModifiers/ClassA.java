package accessModifiers;

import java.time.LocalDate;

public class ClassA {

	public static void main(String[] args) {
		ClassA ac = new ClassA();
		ac.method1();
		ac.method2();
		ac.method3();
		ac.Method4();
		System.out.println("Inside main Method");	
	}
	//private modifier can be access only within the class.
	private void method1() {
		int age = 1;
		System.out.println("Private Access Modifier.");
		System.out.println("My son age :" + age);
	}
	//default modifier can be access within the class and package
	void method2() {
		
		int num1 = 10;
		int num2= 10;
		System.out.println("Default Access Modifier ");
		System.out.println("The sum is = " + (num1+num2));
	}
	//Protected modifier can be use within package and outside package.
	protected void method3() {
		
		System.out.println("Protected Access Modifier ");
		for(int i =1; i<=10;i++) {
			System.out.println(i);
		}
	}
	//Public Access Modifier can be access from everywhere.
	public void Method4() {
		
		LocalDate date = LocalDate.now();
		System.out.println("Public Access Modifier.");
		System.out.println("Today's date : " + date);

	}

}
