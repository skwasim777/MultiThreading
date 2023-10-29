package synchronization.synchroniz;

public class Main {
	public static void main(String[] args) {
		Sender s = new Sender();
		SenderThread se1 = new SenderThread("Hola", s);
		SenderThread se2 = new SenderThread("Hello", s);
		se1.start();
		se2.start();
		try {
			se1.join();
			se2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
