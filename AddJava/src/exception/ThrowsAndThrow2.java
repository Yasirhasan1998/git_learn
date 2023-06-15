package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsAndThrow2 {

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void method() throws FileNotFoundException {
		FileReader f = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader bf = new BufferedReader(f);
		throw new FileNotFoundException();

	}

}
