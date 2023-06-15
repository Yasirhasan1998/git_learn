package multithreding;

class Test1 extends Thread {
	public void run() {
		System.out.println("hello thread");

	}

}

public class TestByThread {

	public static void main(String[] args) {

		Test1 t = new Test1();
		t.start();
		//t.start();// thread 2nd time start not possible other wise run time exception provide

	}

}
