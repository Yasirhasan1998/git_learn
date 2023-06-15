package map;

import java.util.HashMap;
import java.util.Map;

public class HasMapele {

	public static void main(String[] args) {
		Map<String, Integer> no = new HashMap<String, Integer>();//new TreeMap<>(); use for keys orders sorted karte hai

		no.put("one", 1);
		no.put("two", 2);
		no.put("three", 3);
		no.put("four", 4);
		no.put("five", 5);
 
		System.out.println(no);
		System.out.println("-----------------");
		
		for (String key : no.keySet()) {
			System.out.println(key);
		}
		for (Integer value : no.values()) {
			System.out.println(value);
		}
		
//		if(!no.containsKey("nine")) {
//			no.put("nine", 9);
//			System.out.println(no);
//		
//		}
//		System.out.println("--------------------------");
//		if(no.containsKey("two")) {
//			no.put("two", 21);
//			System.out.println(no);
//		}else {
//			System.out.println("input not valid: ");
//		}
//		
//		System.out.println("__---------------------");
//		no.putIfAbsent("six",44);
//
//		System.out.println(no);
//		System.out.println("-----------------");

		for (Map.Entry<String, Integer> e : no.entrySet()) {
			System.out.println(e);

			System.out.println(e.getKey());

			System.out.println(e.getValue());

		}
		System.out.println("=-------------");
		
		System.out.println(no.containsValue(4));

		System.out.println(no.isEmpty());

		no.remove("two");
		System.out.println(no);
		no.clear();
		
		System.out.println(no);
	}

}
