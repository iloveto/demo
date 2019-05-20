package lambda;

public interface DemoInterface {
    default void defaultMethod(){
        System.out.println("接口的默认方法");
        System.out.println("可以被实现类 调用，即使实现类不实现默认方法");
        System.out.println("可以被子接口继承");
    }

    static void staticMethod(){
        System.out.println("接口的静态方法，只能由接口自己直接调用");
        System.out.println("不能被重写，不能被继承");
    }
}
