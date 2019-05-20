package lambda;

public class DemoInterfaceImpl implements DemoInterface {
    public void defaultMethod() {
        DemoInterface.super.defaultMethod();
        System.out.println("实现默认方法");
    }
}
