package exception;
class NegetiveSizeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Radious cannot be return:";
	}
	@Override
	public String getMessage() {
		return "radious cannot be nagetive:";
	}
}
public class ThrowsAndThrow {
	public static double area(int r) throws NegetiveSizeException {
		if(r<0)
		throw new NegetiveSizeException();
		
		double res=Math.PI*Math.pow(r, 2);
		return res;
	}
      public static int divide(int a,int b) throws ArithmeticException {
    	  int result=a/b;
    	  return result;
      }
	public static void main(String[] args) {
		try {
			int c=divide(6, 0);
			double r=area(3);
			System.out.println(r);
		}catch(Exception e) {
			System.out.println("exception");
		}
		
	

	}

}
