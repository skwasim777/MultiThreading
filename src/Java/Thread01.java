package Java;

public class Thread01 {
		public static void main(String[] args) {
			// creating object of thread class using the constructor 
			Thread t = new Thread("My first thread");
			t.start();
			String str = t.getName();
			System.out.println(str);
		}
}
