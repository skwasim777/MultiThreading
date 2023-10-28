package Java;

public class ThreadInTwice extends Thread {
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		ThreadInTwice t = new ThreadInTwice();
		t.start();
		t.start();
	}
}
