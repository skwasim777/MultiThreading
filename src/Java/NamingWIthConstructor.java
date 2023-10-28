package Java;

public class NamingWIthConstructor extends Thread {
	public NamingWIthConstructor(String name) {
		super(name);
	}

	public void run() {
		System.out.println("Thread is running.....");
	}

	public static void main(String[] args) {
		NamingWIthConstructor c = new NamingWIthConstructor("myThread");
		NamingWIthConstructor c1 = new NamingWIthConstructor("yourThread");

		System.out.println("Thread-0 " + c.getName());
		System.out.println("Thread-1 " + c1.getName());
		c.start();
		c1.start();
	}
}
