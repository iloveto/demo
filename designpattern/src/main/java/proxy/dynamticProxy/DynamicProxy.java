package proxy.dynamticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class DynamicProxy implements InvocationHandler {
    private Object proxyInstance;
    private List<String> blackList = Arrays.asList("游戏", "电影");

    public DynamicProxy(Object o) {
        this.proxyInstance = o;
        System.out.println("注入被代理对象");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for (String blackAddress : blackList) {
            if (arg.contains(blackAddress)) {
                System.out.println("包含违禁地址，禁止访问");
                return null;
            }
        }
        return method.invoke(proxyInstance,arg);
    }
}
