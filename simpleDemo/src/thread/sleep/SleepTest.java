package thread.sleep;

public class SleepTest {
    public static void main(String[] args) {
        RunnableA threadA = new RunnableA();
        RunnableB threadB = new RunnableB();
        Thread thread = new Thread(threadA);
        Thread thread2 = new Thread(threadB);
    }
}
