package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Character,String> hm = new HashMap<Character,String>();
		//LinkedHashMap<Character,String> hm = new LinkedHashMap<Character,String>();
		//when using LinkedHashMap its coming insertion order, no order maintain in hashmap.
		hm.put('N', "New York");
		hm.put('A', "Arizona");
		hm.put('G', "Georgia");
		hm.put('B', "Buffalo");
		hm.put('O', null);
		hm.put(null, "Albany");
		hm.put('L', null);
		hm.put('M', null);
		hm.remove('N', null);
		hm.replace('M', null, "Maine");

		System.out.println(hm);
		
		for(Map.Entry<Character, String> m : hm.entrySet()) {
			System.out.println(m.getKey()+" - "+ m.getValue());
			
		
			try {
				// if else does work only inside try catch block.
				//without try catch block its throwing exception.
			if(m.getKey().equals('G')) {
				System.out.println("Georgia is available");}
				
			} catch(NullPointerException e) {
				System.out.println(e);
			}///finally {
		//		System.out.println();
			//}
		}
		HashMap<Character,String> hmn = new HashMap<Character,String>();
			hmn.putAll(hm);
			if(hm.containsKey('B')) {
				System.out.println("Available");
				
			if(hm.containsValue("Texas")) {
				System.out.println("Available");
			} else {
				System.out.println("Not available");
				
				System.out.println(hm.isEmpty());
			}
			}
	}
	 
		
	}
	

