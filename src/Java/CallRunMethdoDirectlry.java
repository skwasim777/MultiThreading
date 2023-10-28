package Java;

public class CallRunMethdoDirectlry extends Thread {
	public void run() {
		System.out.println("Runnig....");
	}
	public static void main(String[] args) {
		CallRunMethdoDirectlry t = new CallRunMethdoDirectlry();
		t.run();
	}
}
