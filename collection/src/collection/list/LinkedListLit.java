package collection.list;


import java.util.LinkedList;

public class LinkedListLit {

	public static void main(String[] args) {
		LinkedList<String> stName = new LinkedList<>();

		stName.add("ram");
		stName.add("kam");
		stName.add("man");
		stName.add("pol");
		stName.add("xxx");

		System.out.println(stName);
		
		stName.set(4, "bils");
		System.out.println(stName);
		
		System.out.println(stName.clone());

		System.out.println(stName.element());//retrive the first element
		System.out.println(stName.contains("kam"));
		System.out.println(stName.contains("nill"));
		
		System.out.println(stName.get(1));
		System.out.println(stName.getFirst());
		System.out.println(stName.getLast());
		
		System.out.println(stName.indexOf("man"));
		System.out.println(stName.lastIndexOf("pol"));
		
		stName.offer("nihi");
		System.out.println(stName);//add the specified element as the last
		stName.offerFirst("milan");//insert the specified element at the front
		System.out.println(stName);
		
		System.out.println(stName.peek());//retrieves the first element of a list
		System.out.println(stName.peekLast());
		
		stName.poll();
		System.out.println(stName);//retrieve and remove the first element of the list 
		stName.pollLast();
		System.out.println(stName);
		
		stName.pop();
		System.out.println(stName);
		stName.push("emeli");
		System.out.println(stName);
		
		stName.remove();//it is retrieve and remove the first element of the list
		System.out.println(stName);
		
		stName.remove(1);
		System.out.println(stName);
		
		
		stName.clear();
		System.out.println(stName);

	}

}
