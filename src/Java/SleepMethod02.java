package Java;

public class SleepMethod02 extends Thread {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
