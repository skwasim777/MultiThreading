package Java;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread works...");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		DaemonThread d = new DaemonThread();
		DaemonThread d1 = new DaemonThread();

		d.setDaemon(true);
		d.start();
		d1.start();
	}
}
