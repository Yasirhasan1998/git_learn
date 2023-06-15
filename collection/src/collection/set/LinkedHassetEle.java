package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHassetEle {

	public static void main(String[] args) {//linkedhasset order maintained karte hai
		Set<Integer> s = new LinkedHashSet<Integer>();

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
