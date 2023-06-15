package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("cat");
		list.add("dog");
		list.add("tiger");

//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.hasNext());
//		}
		System.out.println(list);
		System.out.println("--------");
		System.out.println(list.get(1));
		System.out.println(list.set(2, "lion"));

		System.out.println("--------------");
		System.out.println("list of animal for foreach loop");
		list.forEach(animal -> {
			System.out.println(animal);
		});
		System.out.println("-----------");
		ArrayList<Integer> nb = new ArrayList<>();
		nb.add(6);
		nb.add(2);
		nb.add(3);
		Collections.sort(nb);

		nb.forEach(no -> {
			System.out.print(no + ",");
		});
		System.out.println("--------");
		ArrayList<String> l = new ArrayList<String>();

		list.add("james");
		list.add("nihal");
		list.add("putin");
		
		list.addAll(l);
		System.out.println(list);
       
	}
}
