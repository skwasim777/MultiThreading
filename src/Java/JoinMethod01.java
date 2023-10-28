package Java;

public class JoinMethod01 extends Thread {
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
		JoinMethod01 j1 = new JoinMethod01();
		JoinMethod01 j2 = new JoinMethod01();
		j1.start();
		j1.join(1500);
		j2.start();
	}
}
