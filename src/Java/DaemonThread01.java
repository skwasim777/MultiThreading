package Java;

public class DaemonThread01 extends Thread {
	public void run() {
		System.out.println("Name : " + Thread.currentThread().getName());
		System.out.println("Daemon : " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		DaemonThread01 t = new DaemonThread01();
		DaemonThread01 t1 = new DaemonThread01();

		//t.start();
		t.setDaemon(true);
		t1.start();
	}
}
