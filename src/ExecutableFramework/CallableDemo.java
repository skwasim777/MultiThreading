package ExecutableFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] my = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable call : my) {
			Future f = service.submit(call);
			
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
