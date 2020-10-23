package volatiledemo.atom;

/**
 * 来自：https://blog.csdn.net/qq_15764477/article/details/105530199
 * 此例子有点问题，就是循环的次数少了，导致无法出现效果
 * votile不具有原子性：如果一个操作分可分为几个部分，volatile不能保证一次性执行完这些部分
 */
public class TestMain {
    public static void main(String[] args) {
        P p = new P();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();
    }
}
