package generics;

import java.util.ArrayList;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
//		Java, generics only work with objects, not with primitive types,
//		List<int> myList = new ArrayList<int>();
		
	
		List<String> f=new ArrayList<String>();
		f.add("nill");
		f.add("kabirul");
		
		String s=f.get(0);
		String s1=f.get(1);
		System.out.println(s);
		System.out.println(s1);
	}

}
