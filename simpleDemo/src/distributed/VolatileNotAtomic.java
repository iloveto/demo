package distributed;

public class VolatileNotAtomic {
    private static volatile long cout = 0L;
    private static final int NUMBER = 10000;

    public static void main(String[] args) {
       Thread substractThread = new SubstractThread();
        Thread substractThread2 = new SubstractThread();
       substractThread.start();
        substractThread2.start();
        for (int i = 0; i < NUMBER; i++) {
            cout ++;
        }
        while (substractThread.isAlive()) {

        }
        System.out.println(cout);

    }

    private static class SubstractThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < NUMBER; i++) {
                cout --;
            }
        }
    }
}
