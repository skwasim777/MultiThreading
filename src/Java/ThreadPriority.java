package Java;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("inside thr run method...");
	}

	public static void main(String[] args) {
		ThreadPriority p1 = new ThreadPriority();
		ThreadPriority p2 = new ThreadPriority();
		ThreadPriority p3 = new ThreadPriority();

		System.out.println("priority of the thread p1 : " + p1.getPriority());
		System.out.println("priority of the thread p2 : " + p2.getPriority());
		System.out.println("priority of the thread p3 : " + p3.getPriority());

		p1.setPriority(4);
		p2.setPriority(6);
		p3.setPriority(7);

		System.out.println("Getting Priority of p1 " + p1.getPriority());
		System.out.println("Getting Priority of p2 " + p2.getPriority());
		System.out.println("Getting Priority of p3 " + p3.getPriority());

		System.out.println("Current Thread : " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());

		p1.start();
		p2.start();
		p3.start();
	}
}
