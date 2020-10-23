package reflect.longlongago;


class Base2 {
    static { System.out.println("加载Base类"); }
}

class Derived extends Base2 {
    static { System.out.println("加载Derived类");}
}

public class Test {
    static void printerInfo(Class c) {
        System.out.println("类名: " + c.getName() +
                "是否接口? [" + c.isInterface() + "]");
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("reflect.longlongago.Derived");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到Base类");
            System.exit(1);
        }
        printerInfo(c);

        Class up = c.getSuperclass(); // 取得c对象的基类
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("不能实例化");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("不能访问");
            System.exit(1);
        }
        printerInfo(obj.getClass());
    }
}
