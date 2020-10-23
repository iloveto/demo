package thread.sleep;

public class RunnableB implements Runnable{
    private Thread thread1;

    @Override
    public void run() {
        System.out.println("进入B线程");

    }
}
