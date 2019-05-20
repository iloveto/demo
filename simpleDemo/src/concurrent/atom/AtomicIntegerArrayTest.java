package concurrent.atom;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 修改atom 不影响原来的数组
 */
public class AtomicIntegerArrayTest {
    static int[] value = new int[]{1, 2};

    static AtomicIntegerArray ai = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        ai.getAndSet(0, 3);
        System.out.println(ai.get(0));
        System.out.println(value[0]);
    }
}
