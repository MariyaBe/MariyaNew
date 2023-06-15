package mariya;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String movie = 	"Forest gump is a great movie";
		
		System.out.println(movie+"!");
		
		System.out.println("UPPER CASE = "+ movie.toUpperCase());
		System.out.println("LOWER CASE = "+ movie.toLowerCase());
		System.out.println("CONTAINS \"movies\" = "+ movie.contains("movies"));
		System.out.println("CONTAINS \"movie\" = " + movie.contains("movie"));
		System.out.println("CHARACTER AT 12 = " + movie.charAt(12));
		System.out.println("LENGTH OF STRING = " + movie.length());
		System.out.println("INDEX OF \"g\" = " + movie.indexOf("g"));
		System.out.println("LAST INDEX OF \"i\"=" + movie.lastIndexOf("i"));
		System.out.println("SUBSTRING 1 TO 10 = " + movie.substring(1,10));

		System.out.println("SUBSTRING WITH EXTRA* METHOD = " + movie.substring(0, movie.lastIndexOf(" ")));

	}

}
