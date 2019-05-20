package proxy.dynamticProxy;

import proxy.Internet;
import proxy.Modem;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Modem类是代理类，
 * DynamicProxy类是代理具体加的东西，本质是invocation handler，要implements InvocationHandler接口
 * modemProxy就是Modem类的代理实例
 * 动态代理就是
 *
 * 动态代理的两种实现方式：
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler proxy = new DynamicProxy(new Modem());
        Internet modemProxy = (Internet)Proxy.newProxyInstance(Modem.class.getClassLoader(),Modem.class.getInterfaces(),new DynamicProxy(new Modem()));
        modemProxy.access("www.电影.com");
        modemProxy.access("www.学习.com");
        Intranet switch2 =  (Intranet)  Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(), new DynamicProxy(new Switch()));

        switch2.access("www.电影.com");
        switch2.access("www.学习.com");
    }
}
