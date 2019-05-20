package concurrent.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static final int THREAD_COUNT = 30;
    private static ExecutorService e = Executors.newFixedThreadPool(30);
    private static Semaphore s = new Semaphore(10);
    public static void main(String[] args) {
//        for (int i = 0; i < 30; i++) {
//            e.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        s.acquire();
//                        System.out.println("save data");
//                        s.release();
//                    } catch (InterruptedException e1) {
//                        e1.printStackTrace();
//                    }
//                }
//            });
//        }
        for (int i = 0; i < 30; i++) {
            e.execute(new job(s));
            System.out.println("剩余的许可证数："+s.availablePermits());
        }
        e.shutdown();
    }

    static class job implements Runnable {
        private Semaphore s;
        public job(Semaphore s){
            this.s = s;
        }
        @Override
        public void run() {
            try {
                s.acquire();
                Thread.sleep(1000);
                System.out.println("save data");
                s.release();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
