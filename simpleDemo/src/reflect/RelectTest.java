package reflect;

/**
 * 获取字节码有3种方式
 * 类名.class
 * Class<?> class  = 实例.getClass()
 * Class<?> class = Class.forName("全类名")
 */
public class RelectTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> testClass = Class.forName("java.util.Stack");

    }
}
