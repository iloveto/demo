package proxy.dynamticProxy;

public class Switch implements Intranet {

    @Override
    public void access(String url) {
        System.out.println("访问局域网：" + url);
    }
}
