package synchronization;

public class MyThread03 extends Thread{
	Table02 t;

	public MyThread03(Table02 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
