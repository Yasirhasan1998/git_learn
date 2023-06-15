package collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeEle {// use age vi ele dal sakte ho piche vi ele dal sakteho

	public static void main(String[] args) {

		ArrayDeque<Integer> a = new ArrayDeque<Integer>();

		a.offer(65);// from queue and offerfast and offerlast from arraydeque
		a.offerFirst(34);// offerfast element ko head pe add kardega
		a.offerLast(23);
		System.out.println(a);

		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());

		System.out.println(a.poll());
		System.out.println("poll:" + a);

		System.out.println(a.pollFirst());
		System.out.println("pollfirst:" + a);

		System.out.println(a.pollLast());
		System.out.println("polllast:" + a);

	}

}
