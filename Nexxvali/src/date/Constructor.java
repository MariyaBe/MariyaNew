package date;

public class Constructor {

	 static int x = 0;

	public Constructor(int x) {
		this.x = 10;
		System.out.println(x);
	}

	public Constructor() {
		System.out.println("this is default ");	}

	public Constructor(String string) {
		System.out.println(string);
	}
	
	
	public void method1() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor obj = new Constructor();
		Constructor obj2 = new Constructor(10);
		Constructor obj3 = new Constructor("boy");

		obj2.method1();
		obj3.method1();
	}

}
	
	


