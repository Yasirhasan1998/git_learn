package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HassetEle {//duplicate ele is not alowed in set

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(12);
		s.add(45);
		s.add(34);
		s.add(39);
		s.add(45);
		System.out.println(s);
		
		s.remove(12);
		System.out.println(s);
		
		System.out.println(s.contains(78));
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		
		s.clear();
		System.out.println(s);
		

	}

}
