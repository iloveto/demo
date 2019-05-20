package flyweight;

public class GrassPainter implements Painter {

    public GrassPainter() {
        //构造HousePainter
        System.out.println("构造GrassPainter,加载资源");
    }

    public void paint(int x, int y) {
        System.out.println("开始在坐标x:"+x+","+"y:"+y+"处绘制草");
    }
}
