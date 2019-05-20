package lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        ReentrantLockTest r = new ReentrantLockTest();
        new Thread(){
            @Override
            public void run() {
                r.insert(Thread.currentThread());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                r.insert(Thread.currentThread());
            }
        }.start();

    }

    public void insert(Thread thread) {
        if (lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "get lock");
                for (int i = 0; i < 5; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {

            } finally {
                System.out.println(thread.getName() + "释放了锁");
                lock.unlock();
            }
        }else {
            System.out.println(thread.getName() + "获取锁失败");
        }

    }
}
