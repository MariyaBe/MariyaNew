package interfaceExample;

public class Interface implements classBBB,classCC {

	public static void main(String[] args) {
		Interface in = new Interface();
		in.seat();
		in.wheel();
		in.mirror();

	}
	public void seat() {
		System.out.println("Inside interface seat method body  ");
	}
	public void wheel() {
		System.out.println("Inside interface wheel method body  ");

	}
	public void mirror() {
		System.out.println("Inside interface class CC Mirror method");
	}
}

	interface classBBB{
		
		void seat();
		void wheel();
	}

 interface classCC{
	 
	 void mirror();
 }


