package flyweight;

/**
 * 本质是：共享对象。外部能通过关键词 获取到对象，如果对象已创建，则返回对象，如果未创建则创建并返回
 */
public class Test {
    public static void main(String[] args) {
        Factory f = new Factory();
        f.getPainter("房子").paint(1,2);
        f.getPainter("草").paint(2,2);
        f.getPainter("房子").paint(1,2);
        f.getPainter("草").paint(2,2);

    }
}
