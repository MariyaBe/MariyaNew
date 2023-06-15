package collection;

import java.util.TreeSet;

public class TreeSetNew {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Mike");
		ts.add("Mavin");
		ts.add("Jack");
		
		System.out.println(ts);
	 	}
		
		public void method() {
		TreeSet<String> tss = new TreeSet<String>();
	
		tss.add("Noman");
		tss.add("Mariya");
		tss.add("Rihan");
		tss.remove("Mariya");
		tss.removeAll(tss);
		System.out.println(tss);
		//tss.addAll(ts);
		//tss.removeAll(ts);
		//System.out.println(ts);

		
		
		if(tss.contains("Mariya")) {
			System.out.println("Available");
		} else {
			System.out.println("Not Available");
			
		}	
		
	
	}

}
