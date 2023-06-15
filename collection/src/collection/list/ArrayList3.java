package collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> st = new ArrayList<String>();
		st.add("yasir");
		st.add("nill");
		st.add("akash");
		try {
			// serialization
			FileOutputStream f = new FileOutputStream("file");
			ObjectOutputStream ob = new ObjectOutputStream(f);
			ob.writeObject(st);
			f.close();
			ob.close();

			// deserilization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream os = new ObjectInputStream(fis);
			ArrayList<?> list = (ArrayList<?>) os.readObject();
			System.out.println(list);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
