package Java;

public class CurrentThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		CurrentThread c1 = new CurrentThread();
		CurrentThread c2 = new CurrentThread();

		c1.start();

		c2.start();
	}
}
