package controlstatement;

public class StringExample {

	public static void main(String[] args) {

		

			String var = "SUNday";
	//var = var.toLowerCase();
			System.out.println("Before manipulating the value : " + var);

			// how to modify the variable in to upper case
			System.out.println("Upper case : " + var.toUpperCase());

			// how to modify the variable in to lower case
			System.out.println("Lower case : " + var.toLowerCase());

			// how to find the length of the string variable
			System.out.println("Length is : " + var.length());

			// how to use the substring method
			System.out.println("Substring value is : " + var.substring(3));

			// how to use the substring method
			System.out.println("Substring value is : " + var.substring(4, 6));

			// how to use the concat method
			System.out.println("Conated value is : " + var.concat(" Weekend"));

			// how use multiple methods in one go
			System.out.println(var.toUpperCase().concat(" weekend"));

			// how to use charAt method
			System.out.println("Char at value is : " + var.charAt(2));

			// how to use contains method
			System.out.println("" + var.contains("SUN"));
			if (var.contains("X")) {
				System.out.println("Value is available in string variable");
			} else {
				System.out.println("Value is not available in string variable");
			}

			// how to use equalsIgnoreCase method
			if (var.equalsIgnoreCase("sunday")) {
				System.out.println("Value are same");
			} else {
				System.out.println("Value are not same");
			}

			// how to use equals method
			if (var.equals("SUNday")) {
				System.out.println("Value are same");
			} else {
				System.out.println("Value are not same");
			}

			// how to use isEmpty method
			String vari = "";
			if (vari.isEmpty()) {
				System.out.println("Values are empty");
			} else {
				System.out.println("Value are not empty");
			}

			// how to use replace method
			String variable = "Hi today is sunday, Hi yesterday is saturday, Hi tomorrow is monday";
			System.out.println("Replaced values are : " + variable.replace('H', 'J'));

			// how to use replace all method
			String varia = "Hi today is sunday, Hi yesterday is saturday, Hi tomorrow is monday";
			System.out.println("Replaced values are : " + varia.replaceAll("Hi today", "Hello"));

			// how to use split method
			System.out.println("Splited values are : " + varia.split(" "));
			String split[] = varia.split(" ");
			for (String splits : split) {
//				System.out.println(splits.toString());
			}
			for (int i = 0; i < varia.length(); i++) {
//				System.out.println(split[i]);
			}

			// how to use startsWith method
			System.out.println("Starts with " + varia.startsWith("Ji"));

			// how to use endsWith method
			System.out.println("Ends with " + varia.endsWith("mondays"));
			
		
			// how to use charArray method
			char charArray[] = var.toCharArray();
			for(char temp : charArray) {
				System.out.println(temp);}
		
			StringBuffer variabl = new StringBuffer("Sunday");
			System.out.println(variabl.append(" Weekend"));
			
			StringBuilder variab = new StringBuilder("Monday");
			System.out.println(variab.append(" Weekday"));
			
		}
		
		
	}


