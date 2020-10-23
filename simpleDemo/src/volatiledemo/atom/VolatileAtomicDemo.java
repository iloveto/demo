package volatiledemo.atom;

/**
 * 证明volatile不具有原子性
 *来自 https://blog.csdn.net/weixin_43938877/article/details/102710298
 */
public class VolatileAtomicDemo {
	public static volatile int counter = 0;

	public static void increase() {
		//synchronized (Object.class) {
		counter++;
		//}
	}

	public static void main(String[] args) throws InterruptedException {
		// 1. 创建容量为10的Thread对象的数组
		Thread[] threads = new Thread[2];
		for (int i = 0; i < 2; i++) {
			threads[i] = new Thread(() -> {
				// 2. 每个Thread执行1_000次 +1 的操作
				for (int j = 0; j < 1000; j++) {
					increase();
				}
			});
			threads[i].start();
		}

		// 3. 主线程等待子线程运行结束
		for (Thread thread : threads) {
			thread.join();
		}

		// 4. 观察结果，看最后counter变量的值，是否为 10_0000
		// 9523
		System.out.printf("最后counter的数值为：%d", counter);
	}
}