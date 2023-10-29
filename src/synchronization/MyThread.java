package synchronization;

public class MyThread extends Thread {
	Table t;

	public MyThread(Table t) {
		this.t = t;
	}

	public void run() {
		t.table(5);
	}
}

class MyThread01 extends Thread {
	Table t;

	public MyThread01(Table t) {
		this.t = t;
	}
	public void run() {
		t.table(100);
	}
}
