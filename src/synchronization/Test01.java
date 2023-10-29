package synchronization;

public class Test01 {
	public static void main(String[] args) {
		Table t = new Table();
		MyThread t1 = new MyThread(t);
		MyThread01 t2 = new MyThread01(t);
		t1.start();
		t2.start();
	}
}
