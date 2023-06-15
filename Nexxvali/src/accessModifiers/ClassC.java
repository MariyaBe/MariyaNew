package accessModifiers;

public class ClassC extends ClassA{

	public static void main(String[] args) {

		ClassC cc = new ClassC();
//inside same package accessed default,protected,public
		cc.method2();
		cc.method3();
		cc.Method4();
		
	}

}
