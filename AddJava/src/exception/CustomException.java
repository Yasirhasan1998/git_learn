package exception;

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new MyException("exception");
		}catch(MyException e) {
			System.out.println("yes");
			// Print the message from MyException object
			System.out.println(e.getMessage());
		}
	}

}
class MyException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s) {
		super(s);
	}
}
