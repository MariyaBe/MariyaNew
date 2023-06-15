package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Character,String> tm = new TreeMap<Character,String>();
		
		
		
		tm.put('A', "Arizona");
		tm.put('N', "New York");
		tm.put('G', "Georgia");
		tm.put('B', "Buffalo");
		tm.put('L', null);
		//tm.containsKey(tm);
		System.out.println(tm);
		for(Map.Entry<Character,String> n : tm.entrySet()) {
		System.out.println(n.getKey()+ "- " + n.getValue());
		
		try {
		if(n.getValue().contains("Buffalo")) {
			System.out.println("Available");
		}
		
		} catch(NullPointerException e) {
			//System.out.println(e);
		}
		}
		//why there is no .contains available. 
			
		}
		
	}


