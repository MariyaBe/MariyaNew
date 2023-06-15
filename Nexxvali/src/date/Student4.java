package date;

public class Student4 {

	 	int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Student4(int i ,String n){  
	    id = i;  
	    name = n;  
	    System.out.println(i+n);
	    }  
	    //method to display the values  
	    void display(){System.out.println(id + name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Student4 s1 = new Student4(11," Karan");  
	    Student4 s2 = new Student4(22," Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  
		
		  



