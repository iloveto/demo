package proxy;

public class Modem implements Internet{
    public void access(String url) {
        System.out.println("Modem访问:"+url);
    }
}
