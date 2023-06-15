package collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetNew extends TreeSetNew {

	public static void main(String[] args) {

		HashSetNew hsn = new HashSetNew();
		hsn.method();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(30);
		hs.add(20);
		hs.add(null);
		hs.add(30);
		hs.add(325);
		hs.add(2);
		hs.add(50);
		hs.add(27);
		hs.remove(325);
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs.size());
		System.out.println();
		System.out.println();
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(20);
		lhs.add(10);
		lhs.add(5);
		lhs.add(30);
		lhs.add(325);
		lhs.add(2);
		lhs.add(null);
		lhs.add(27);
		lhs.remove(20);
		
		
		System.out.println(lhs);
		//System.out.println(lhs.remove(1));
		

		
		
	}

}
