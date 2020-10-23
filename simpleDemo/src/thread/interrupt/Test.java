package thread.interrupt;

/**
 * 调用interrupt()会将中断标志位改为ture
 * 掉用isInterrupted()判断是否被中断
 * 在抛出InterruptedException前 中断标志位会被清除
 *
 */
public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableTest());
        t.start();
        System.out.println(t.isInterrupted());
        t.interrupt();
        System.out.println(t.isInterrupted());
    }

    static class RunnableTest implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("睡眠10秒");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                //在抛出异常前，中断标志位被清除
                System.out.println(Thread.currentThread().isInterrupted());
                e.printStackTrace();
            }
        }
    }

}


