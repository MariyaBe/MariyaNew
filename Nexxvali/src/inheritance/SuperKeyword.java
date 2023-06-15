package inheritance;

public class SuperKeyword extends F{

	public static void main(String[] args) {

		SuperKeyword SK = new SuperKeyword();
		  
		
		SK.test();
	}

}
   
class state {
	String city = "Buffalo";
	
	   void weather() {
		System.out.println("Snowy day in " + city);  
		  
	  }
	  
}

class city extends state {
	
	
	 
	 void printCity() {
		
		System.out.println("City name is: " + city);
		super.weather();
	}
	
}
class F extends D {
	
	void test() {
		
		System.out.println("Test printing");
	}
	
}

 

