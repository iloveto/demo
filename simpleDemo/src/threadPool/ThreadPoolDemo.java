package threadPool;

import lock.ReentrantLockTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolDemo {
    private static Integer num = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        List<Future> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                Future f = executorService.submit(new Task(num,lock));
                list.add(f);

            } finally {
                lock.unlock();
            }

        }
        Thread.sleep(10000);
        list.stream().forEach(e->{
            try {
                num+=Integer.parseInt(e.get().toString());
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } catch (ExecutionException executionException) {
                executionException.printStackTrace();
            }
        });

        System.out.println(num);
    }


}

class Task implements Callable {
    private Integer num;
    private Lock lock;

    public Task(Integer num,Lock lock) throws InterruptedException {
        Thread.sleep(100);
        this.num = num;
        this.lock = lock;
//        System.out.println(Thread.currentThread().getName());
    }


    @Override
    public Object call() throws Exception {
        num += 1;
        System.out.println(Thread.currentThread().getName());
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName());
        }finally {
            lock.unlock();
        }
        return num;
    }
}
