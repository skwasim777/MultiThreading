package Java;

public class ThreadPriority01 extends Thread {
	public void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
		ThreadPriority01 t = new ThreadPriority01();
		System.out.println("priority if the thread t : " + t.getPriority());
	}
}
