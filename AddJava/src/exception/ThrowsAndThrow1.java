package exception;

public class ThrowsAndThrow1 {

	public static void main(String[] args) {
		valid(16);

	}
	public static void valid(int age) {
		if(age<18) {
			throw new ArithmeticException("persone not aligible for vote ");
		}else {
			System.out.println("persone aligible for vote");
		}
	}

}
