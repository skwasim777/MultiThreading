package ExecutableFramework;

public class ThreadPool implements Runnable {
	String name;

	public ThreadPool(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "..job started by Thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "..job completed by thread " + Thread.currentThread().getName());

	}

}
