package distributed;

import org.junit.jupiter.api.Test;

public class VolatileTest {
    private int a = 1;
    private boolean flag = false;

    public void change() {
        a = 2;
        flag = true;
    }

    @Test
    public void run() {
        if (flag) {
            int b = a+1;
            System.out.println(b);
        }
    }

}
