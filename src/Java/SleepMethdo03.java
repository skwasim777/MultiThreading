package Java;

public class SleepMethdo03 {
		public static void main(String[] args) {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(-100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
}
