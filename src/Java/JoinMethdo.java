package Java;

public class JoinMethdo extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethdo j1 = new JoinMethdo();
		JoinMethdo j2 = new JoinMethdo();
		JoinMethdo j3 = new JoinMethdo();

		j1.start();
		j1.join();
		j2.start();
		j2.join();
		j3.start();
	}
}
