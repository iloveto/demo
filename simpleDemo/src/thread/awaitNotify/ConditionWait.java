package thread.awaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 等待通知有2种实现方式
 * 第一种是Object的wait()和notify
 * 第二种是Condition的wait和singal
 * Condition是锁产生的
 */
public class ConditionWait {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() throws InterruptedException {
        lock.lock();
        try {
            condition.await();
        } finally {
            lock.unlock();
        }
    }

    public void singal() {
        lock.lock();
        try {
            condition.signal();
        } finally {
            lock.unlock();
        }
    }


    static class Runner implements Runnable {

        @Override
        public void run() {
            System.out.println("线程："+Thread.currentThread().getName());
        }
    }
}
