package Java;

public class SleepMethdo01 extends Thread{
			public void run() {
				for(int i=1;i<5;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
			public static void main(String[] args) {
				SleepMethdo01 s = new SleepMethdo01();
				SleepMethdo01 s1 = new SleepMethdo01();
				s.start();
				s1.start();
			}
}
