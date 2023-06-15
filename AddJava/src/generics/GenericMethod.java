package generics;

public class GenericMethod {

	public static void main(String[] args) {
		MyGenericMethod m=new MyGenericMethod();
		Integer[] in= {1,2,34,5};
		m.printArray(in);
		String[] st= {"nill","bikash"};
		m.printArray(st);

	}

}
class MyGenericMethod{
	public<T>void printArray(T[] arr){
		for(T ele:arr) {
			System.out.println(ele);
		}
		
	}
}