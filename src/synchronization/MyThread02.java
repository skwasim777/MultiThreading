package synchronization;

public class MyThread02 extends Thread {
	Table02 t;

	public MyThread02(Table02 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}
