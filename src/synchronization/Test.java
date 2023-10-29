package synchronization;

public class Test {
	public static void main(String[] args) {
		final Table01 obj = new Table01();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(10);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(20);
			}
		};
		t1.start();
		t2.start();
	}
}

class Table01 {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
