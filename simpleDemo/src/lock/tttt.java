package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tttt {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
    }
}
