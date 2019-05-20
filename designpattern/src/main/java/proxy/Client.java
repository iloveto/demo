package proxy;

public class Client {
    public static void main(String[] args) {
        Internet m = new StaticProxy();
        m.access("www.学习.com");
        m.access("www.游戏.com");
    }
}
