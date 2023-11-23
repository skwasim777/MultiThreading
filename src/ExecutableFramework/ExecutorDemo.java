package ExecutableFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
			ThreadPool[] jobs = {
					new ThreadPool("Wasim"),
					new ThreadPool("Farhan"),
					new ThreadPool("Salman"),
					new ThreadPool("Lukman")
			};
			ExecutorService service = Executors.newFixedThreadPool(4);
				for(ThreadPool pool : jobs) {
					service.submit(pool);
				}
			service.shutdown();
		}
}
