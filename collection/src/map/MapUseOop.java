package map;

import java.util.HashMap;
import java.util.Map;

public class MapUseOop {

	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		Student s = new Student(101, 12, "kal");
		Student s1 = new Student(102, 23, "nilll");
		Student s2 = new Student(103, 44, "kill");
		// adding in map;
		map.put(1, s);
		map.put(2, s1);
		map.put(3, s2);
		
		// traversing map
		for (Map.Entry<Integer, Student> m : map.entrySet()) {
			System.out.println(m.getKey());
			Student t = m.getValue();
			System.out.println(t.id + "," + t.roll + "," + t.name);

		}
	}

}

class Student {
	int id;
	int roll;
	String name;

	public Student(int id, int roll, String name) {
		this.id = id;
		this.roll = roll;
		this.name = name;
	}
}