package lambda;

public class DemoInterfaceTest {
    public static void main(String[] args) {
        DemoInterface.staticMethod();
        DemoInterface demoInterface = new DemoInterfaceImpl();
        demoInterface.defaultMethod();
    }
}
