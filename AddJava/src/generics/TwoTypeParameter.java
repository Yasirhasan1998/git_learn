package generics;

public class TwoTypeParameter {

	public static void main(String[] args) {
		MyGen<String, Integer> gn = new MyGen<String, Integer>("String", 23);
		System.out.println(gn.getFirst());
		System.out.println(gn.getSecond());

	}

}

class MyGen<T, U> {
	private T first;
	private U second;

	public MyGen(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}
}
