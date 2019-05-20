package lambda;

public class Demo1 {
    public static void process(Runnable runnable) {
        runnable.run();
    }

    public static void main(String[] args) {
        process(() -> System.out.println("12123123"));
    }

}
