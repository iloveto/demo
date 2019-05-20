package flyweight;

public class HousePainter implements Painter {

    public HousePainter() {
        //构造HousePainter
        System.out.println("构造HousePainter,加载资源");
    }

    public void paint(int x, int y) {
        System.out.println("开始在坐标x:"+x+","+"y:"+y+"处绘制房子");
    }
}
