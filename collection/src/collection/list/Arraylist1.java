package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
//		ArrayList<String> studentName = new ArrayList<String>();
//		
//		studentName.add("ram");
//		studentName.add("kam");
//		studentName.add("man");
//		studentName.add("pol");
//		
//		
//		System.out.println(studentName);
//		
//		studentName.add("micel");//this will be add 5 add the index position
//		System.out.println(studentName);
//		
//		studentName.add(2, "polas");
//		System.out.println(studentName);
//		
//		ArrayList<String> slist = new ArrayList<String>();
//		
//		slist.add("hol");
//		slist.add("mall");
////		slist.addAll(studentName);
//		studentName.addAll(slist);
//		System.out.println(studentName);
//		
//		System.out.println(studentName.get(3));

		List<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(56);
		list.add(90);
		list.add(45);
		list.add(87);

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("element is " + list.get(i));
		}
		
//		for(int i:list) {
//			System.out.println("element is :"+i);
//		}
		list.forEach(i->{
			System.out.println("element are :"+i);
		});
		
		Iterator<Integer> li=list.iterator();
		while(li.hasNext()) {
			System.out.println("element:"+li.next());
		}

//		list.set(2, 77);
//		System.out.println(list);
//		
//		System.out.println(list.contains(90));//if element is present than true & other wise false
//
//		list.remove(2);
//		System.out.println(list);
//
//		list.remove(Integer.valueOf(45));// this will be remove of value of element
//		System.out.println(list);
//		
//		list.clear();//here all element will be deleted
//		System.out.println(list);

	}

}
