package multithreding;

class TestByRunnable1 implements Runnable {

	@Override
	public void run() {
		System.out.println("hel Thread");

	}

}

public class TestByRunnable {

	public static void main(String[] args) {
		//TestByRunnable1 t = new TestByRunnable1();
		//Thread th = new Thread(t);
		//or
		Thread th = new Thread(new TestByRunnable1());
		th.start();

	}

}
