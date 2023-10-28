package Java;

public class StartMethod extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		StartMethod t = new StartMethod();
		t.start();
	}
}
