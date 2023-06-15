package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayListExample a = new ArrayListExample();
		a.method();
		
		ArrayList <Integer>ale = new ArrayList<Integer>();
		ale.add(8);
		ale.add(18);
		ale.add(28);
		ale.add(38);
		ale.add(48);
		ale.add(null);
		
		for(int i =0;i<=100;i++) {
			ale.add(i);
		}
		System.out.println(ale);
		System.out.println(ale.size());
		System.out.println(ale.get(4));
		
		if(ale.contains(1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		ale.set(0, 800);
		System.out.println(ale);
				
	}

	public void method() {
		
		LinkedList<String> ar = new LinkedList<String>();
		ar.add(null);
		ar.add("hi");
		ar.add("Hello");
		ar.add("Good");
		ar.remove(1);
		ar.removeAll(ar);
		//ar.set(2, "bye");
		System.out.println("Used remove/remove all in method" + ar);
		System.out.println(ar.isEmpty());
		
	}
	
}

