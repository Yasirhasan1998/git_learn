package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEle {

	public static void main(String[] args) {
		Queue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());//Comparator convert to min heap to max heap

		qu.offer(34);
		qu.offer(98);
		qu.offer(45);
		qu.offer(87);
		qu.offer(23);
		System.out.println(qu);// here implement is heap isliye chota ele 1st print hoga

		qu.poll();// for small element is 1st delete
		System.out.println(qu);

		
		System.out.println(qu.peek());

	}

}
