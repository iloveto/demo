package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class TestCglibProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Dog proxyDog = (Dog) enhancer.create();
        proxyDog.eat();
    }
}
