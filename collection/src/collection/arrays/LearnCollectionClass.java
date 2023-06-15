package collection.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(129);
		list.add(56);
		list.add(90);
		list.add(45);
		list.add(45);
		list.add(45);
		list.add(87);
		
		System.out.println("min element :"+Collections.min(list));
		System.out.println("max element :"+Collections.max(list));
		System.out.println(Collections.frequency(list, 45));
		
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);

	}

}
