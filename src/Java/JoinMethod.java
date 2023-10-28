package Java;

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();

		j1.start();
		System.out.println("Curret Thread " + Thread.currentThread().getName());
		j1.join();
		j2.start();
	}
}

class Join extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
}
