package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BuildInException {

	public static void main(String[] args) {
		// ArithmeticException
		try {
			int a = 30, b = 0;
			int c = a / b; // cannot divide by zero
			System.out.println("Result = " + c);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
		// NullPointer Exception
		try {
			String a = null;
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("null pointerException:");
		}

		// StringIndexOutOfBound Exception
		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		// FileNotFound Exception
		try {

			// Following file does not exist
			File file = new File("E://file.txt");

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("file notfound exception");
		}

		// . NumberFormat Exception
		try {
			// "akki" is not a number
			int num = Integer.parseInt("akki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
		// ArrayIndexOutOfBounds Exception
		try {
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of
						// size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}

		// IO Exception

		Scanner scan = new Scanner("Hello Geek!");

		// Print the line
		System.out.println("" + scan.nextLine());

		// Check if there is an IO exception
		System.out.println("Exception Output: " + scan.ioException());

		scan.close();
		
		//  ClassNotFound Exception :
		
		try{
            Class.forName("Class1");   // Class1 is not defined
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Class Not Found...");
        }
	}

}
