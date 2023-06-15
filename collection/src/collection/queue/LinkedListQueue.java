package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.offer(2);//offer insert the element into queue
		q.offer(3);
		q.offer(26);
		q.offer(27);
		q.offer(23);
		System.out.println(q);
		
		System.out.println(q.poll());//poll use for fastin element ko fastout karte hai
		
		System.out.println(q);
		
		System.out.println(q.peek());//peek here use hota hai for next element ko findout karne ke liye if the
		//queue is empty then return null
		System.out.println(q.element());//peek here use hota hai for next element ko findout karne ke liye if the
		//queue is empty then return exception
		

	}

}
