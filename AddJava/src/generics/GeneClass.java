package generics;

// To define a generic class, we need to use the type parameter syntax,
//which is denoted by angle brackets (< and >).
public class GeneClass {

	public static void main(String[] args) {
		MyGeneric<String> st = new MyGeneric<String>();
		st.set("yasir");
		System.out.println(st.get());
		
		MyGeneric<Integer> it=new MyGeneric<Integer>();
		it.set(55);
		System.out.println(it.get());
	}

}

class MyGeneric<T> {
	private T ele;

	public void set(T ele) {
		this.ele = ele;
	}

	public T get() {
		return ele;
	}
}
