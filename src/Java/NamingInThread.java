package Java;

public class NamingInThread extends Thread {
	public void run() {
		System.out.println("Running.....");

	}

	public static void main(String[] args) {
		NamingInThread t1 = new NamingInThread();
		NamingInThread t2 = new NamingInThread();
		System.out.println("Name of t1 " + t1.getName());
		System.out.println("Name of t2 " + t2.getName());

		t1.start();
		t2.start();

		t1.setName("my thread");
		System.out.println("After changing t1 thread name = " + t1.getName());
	}
}
