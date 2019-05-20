package audition;

public class test1 {
    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch 语句块");
        } finally {
            System.out.println("finally 语句块");
        }
        return 0;
    }

    public static void main(String[] args) {
        test1 demo = new test1();
        System.out.println("和是:" + demo.add(9, 34));
    }
}




