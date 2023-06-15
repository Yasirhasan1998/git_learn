package generics;

public class Bound {

	public static void main(String[] args) {
		MyClass<Integer> m=new MyClass<>(34);
		System.out.println(m.getValue());

	}

}
class MyClass<T extends Number>{
	private T value;
 
	public MyClass(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
}