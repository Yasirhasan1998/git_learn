package multithreding;

class Task1 extends Thread {
	public void run() {
		System.out.println("hi task");
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("hello task");
	}
}

public class MultipleTaskAndMultipleThread {

	public static void main(String[] args) {

		Task1 t1 = new Task1();
		t1.start();

		Task2 t2 = new Task2();

		t2.start();

	}

}
