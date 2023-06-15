package exception;

public class UserDefinedException extends Exception {

	private static final long serialVersionUID = 1L;

	private static int accno[] = { 1001, 1002, 1003, 1004 };

	private static String name[] = { "Nish", "Shubh", "Sush", "Abhi", "Akash" };

	private static double bal[] = { 10000.00, 12000.00, 5600.0, 999.00, 1100.55 };

//	UserDefinedException() {
//
//	}
//
//	UserDefinedException(String str) {
//		super(str);
//	}

	public static void main(String[] args) {
		try {
			System.out.println("ACCOUNT" + "\t" + "NAME" + "\t" + "BAL");
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				if (bal[i] < 10000) {
					UserDefinedException m = new UserDefinedException();
					System.out.println("balance not found");
					throw m;
				}
			}
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}

	}

}
