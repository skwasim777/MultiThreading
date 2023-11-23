package ExecutableFramework;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
	int num;

	public MyCallable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
