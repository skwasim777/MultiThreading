package Java;

public class Runnable01 implements Runnable {

	@Override
	public void run() {
		System.out.println("Now the thread is running");
	}

	public static void main(String[] args) {
		Runnable01 r = new Runnable01();
		Thread t = new Thread(r, "my first thread");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}

}
