package Java;

public class ExampleOfRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");

	}

	public static void main(String[] args) {
		ExampleOfRunnableInterface e = new ExampleOfRunnableInterface();
		Thread t = new Thread(e);// using the constructor Thread(Runnable r)
		t.start();
	}

}
