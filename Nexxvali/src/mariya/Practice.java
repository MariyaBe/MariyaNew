package mariya;

public class Practice {

	public static void main(String[] args) {
			
	String name = "Mariya Begum ";
	
	System.out.println("\"Mariya\" \nBegum");	
	System.out.println("UPPER CASE = " +name.toUpperCase());		
	System.out.println("LOWER CASE = " + name.toLowerCase());
	System.out.println("LENGTH = " + name.length());
	System.out.println("STRING CONTAINS \"Begum\" = " + name.contains("Begum"));
	System.out.println("STRING CONTAINS \"noman\" = " + name.contains("noman"));
	System.out.println("CHARACTER AT 1 = " + name.charAt(1));
	System.out.println("INDEX OF B = " + name.indexOf("B"));
	System.out.println("LAST INDEX OF a = " + name.lastIndexOf("a"));
	System.out.println("0-10 STRING = " + name.substring(0,10));
	System.out.println("FIRST WORD = " + name.substring(0, name.indexOf(" ")));
	System.out.println(name.substring(name.indexOf("B"), name.lastIndexOf(" ")));
	}
}
