package synchronization.synchroniz;

public class Sender {
	public void sendMsg(String msg) {
		System.out.println("\nSending a Message :" + msg);
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n " + msg + " Sent");
	}
}
