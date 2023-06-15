package accessModifiersNew;

import accessModifiers.ClassA;

public class ClassB extends ClassA {
	
	public static void main(String[] args) {
		 
		ClassB b = new ClassB();
//different package accessed protected public modifiers
		b.method3();
		b.Method4();
				
		
		
	}
}
