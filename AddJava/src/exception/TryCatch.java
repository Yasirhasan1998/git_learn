package exception;

//Control flow in try-catch clause OR try-catch-finally clause 
//  Case 1: Exception occurs in try block and handled in catch block
//  Case 2: Exception occurs in try-block is not handled in catch block
//  Case 3: Exception doesn’t occur in try-block
//try-finally clause 
//  Case 1: Exception occurs in try block
//  Case 2: Exception doesn’t occur in try-block
public class TryCatch {

	public static void main(String[] args) {
		// control flow of try-catch clause
		// when exception occur in try block
		// and handled in catch block
//		int[] arr = new int[4];
//		try {
//			int i = arr[4];
//
//			// this statement will never execute
//			// as exception is raised by above statement
//			System.out.println("Inside try block");
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Exception caught in Catch block");
//		} finally {
//			System.out.println("finally block executed");
//		}
//
//		// rest program will be executed
//		System.out.println("Outside try-catch clause");
//
//		// when exception occurs in try block
//		// but not handled in catch block
//
//		try {
//			int i = arr[4];
//
//			// this statement will never execute
//			// as exception is raised by above statement
//			System.out.println("Inside try block");
//		}
//
//		// not a appropriate handler
//		catch (NullPointerException ex) {
//			System.out.println("Exception has been caught");
//		}
//
//		finally {
//			System.out.println("finally block executed");
//		}
//
//		// rest program will not execute
//		System.out.println("Outside try-catch-finally clause");
//
//		// Java program to demonstrate try-catch
//		// when an exception doesn't occurred in try block
//		try {
//
//			String str = "123";
//
//			int num = Integer.parseInt(str);
//
//			// this statement will execute
//			// as no any exception is raised by above statement
//			System.out.println("Inside try block");
//
//		}
//
//		catch (NumberFormatException ex) {
//
//			System.out.println("catch block executed...");
//
//		}
//
//		System.out.println("Outside try-catch clause");

		// control flow of try-finally clause
		// when exception doesn't occur in try block
		try {
			String str = "123";

			int num = Integer.parseInt(str);

			// this statement will execute
			// as no any exception is raised by above statement
			System.out.println("Inside try block");
		}

		finally {
			System.out.println("finally block executed");
		}

		// rest program will be executed
		System.out.println("Outside try-finally clause");
	}

}
