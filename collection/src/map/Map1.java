package map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<String, Integer> no = new HashMap<String, Integer>();
		no.put("one", 1);
		no.put("two", 2);
		no.put("three", 3);
		no.put("four", 4);

		System.out.println(no);

		for (Map.Entry<String, Integer> e : no.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(e);

		}
		System.out.println("-----------");
		for (String key : no.keySet()) {
			System.out.println(key);
		}
		for (Integer v : no.values()) {
			System.out.println(v);
		}
		System.out.println("========");
		no.putIfAbsent("five", 5);
		System.out.println(no);
		System.out.println("--------");
		if (no.containsKey("nine")) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
		if(!no.containsValue(9)) {
			no.put("nine", 9);
			System.out.println(no);
		}
	}

}
