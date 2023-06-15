package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {

	public static void main(String[] args) {
		
		Set<Student> s=new HashSet<Student>();
		Student s1=new Student("yas", 12);
		Student s2=new Student("rohith", 56);
		Student s3=new Student("pol", 6);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		s.forEach(n->{
			System.out.println(n.name+"->"+n.rollNo);
		});
		

	
	}
}
