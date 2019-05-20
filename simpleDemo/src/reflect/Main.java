package reflect;

public class Main {
    public static void main(String[] args) {
        // 不会初始化静态块
        Class clazz1 = Base.class;
        System.out.println("------");
        // 会初始化
        try {
            Class clazz2 = Class.forName("reflect.Base");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}