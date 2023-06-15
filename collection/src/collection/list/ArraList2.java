package collection.list;


import java.util.ArrayList;

public class ArraList2 {

	public static void main(String[] args) {
		Student s = new Student(12, "yasir", 26);
		Student s1 = new Student(13, "nishan", 36);
		Student s2 = new Student(14, "danial", 56);
		ArrayList<Student> st = new ArrayList<>();
		st.add(s);
		st.add(s1);
		st.add(s2);

		st.forEach(p -> {
			System.out.println(p.name + " , " + p.age + "," + p.rollNo);
		});
		
	}

}

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;

	}
}
