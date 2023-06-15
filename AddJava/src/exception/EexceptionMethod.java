package exception;

public class EexceptionMethod {

	public static void main(String[] args) {
		// printStackTrace() method

		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//toString() – This method
			System.out.println(e.toString());
			//getMessage() -This method
			System.out.println(e.getMessage());
		}

	}

}
