package volatiledemo.atom;

import lombok.Data;

@Data
public class P implements Runnable{
    public volatile static Integer a = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            a++;
        }
        System.out.println("a = " + a);
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        P.a = a;
    }
}
