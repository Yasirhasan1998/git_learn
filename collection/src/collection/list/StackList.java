package collection.list;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.push("hi");
		st.push("hello");
		st.push("hai");
		st.push("hmm");
		
		System.out.println(st);
		
		System.out.println(st.peek());//peek find out top element
		
		st.pop();//pop means top element are deleted
		System.out.println("stac:"+st);
		
		System.out.println(st.peek());
	
		System.out.println(	st.size());
		System.err.println(st.empty());
		System.out.println(st.search("hi"));

	}

}
