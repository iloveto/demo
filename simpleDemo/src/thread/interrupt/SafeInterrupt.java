package thread.interrupt;

/**
 * 安全的中断线程，了来自《Java并发编程的艺术》
 * 主要是用了while循环，通过在外界改变条件，来控制是否继承执行
 */
public class SafeInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner());
        Runner runner = new Runner();
        Thread t2 = new Thread(runner);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        t1.interrupt();
        runner.cancel();
    }

    static class Runner implements Runnable{
        private int i=0;
        private volatile boolean on = true;
        @Override
        public void run() {
            while(on && !Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println(i);
        }

        public void cancel() {
            this.on = false;
        }
    }
}
