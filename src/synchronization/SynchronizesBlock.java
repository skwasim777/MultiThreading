package synchronization;

public class SynchronizesBlock {
	public static void main(String[] args) {
		Table02 t = new Table02();
		MyThread02 t2 = new MyThread02(t);
		MyThread03 t3 = new MyThread03(t);
		t2.start();
		t3.start();
	}
}

class Table02 {
	public void printTable(int n) {
		synchronized (this) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(i * n);
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
