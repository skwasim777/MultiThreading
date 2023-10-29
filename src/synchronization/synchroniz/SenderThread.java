package synchronization.synchroniz;

public class SenderThread extends Thread {
	private String msg;
	Sender sd;

	public SenderThread(String msg, Sender se) {
		this.msg = msg;
		this.sd = se;
	}

	public void run() {
		synchronized (sd) {
			sd.sendMsg(msg);
		}
	}
}
