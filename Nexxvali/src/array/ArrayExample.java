package array;

public class ArrayExample {

	public static void main(String[] args) {

		ArrayExample obj = new ArrayExample();
		obj.method();
		//question= how to print all elements together
		String m []= {"Mariya","Uma","jannatul","Sokria"};
			//for loop
		for(String i:m) {
			System.out.println(i);
		}
		//ptinting index 
		System.out.println(m[2]);
		
		//for loop		
		int n [] = {1,2,3,4,5};
		int count = n.length;
		
		for(int i=0;i<count;i++) {
			System.out.println(n[i]);
		}

		}
	
	   public void method() {
		   
		int b []= {2,3,4,5,6};    
		   
		  int count = b.length;
		  int i = 0;
		while(i<count) {
			System.out.println(b[i]);
			i++;
			
		}
		
		
	   }
}
		
	
	


