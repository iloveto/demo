package lock.deadLock;

public class DeadLock {
    private static String A = "A";
    private static String B = "B";
    public static void main(String[] args) {
        DeadLock l = new DeadLock();
        l.deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        System.out.println("进入线程t1的a");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("进入线程t1的B");
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    System.out.println("进入线程t2的B");
                    synchronized (A) {
                        System.out.println("进入线程t2的A");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
