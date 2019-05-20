package decorate.初级具体;

public class Decorate implements Showable {
    private Showable showable;

    public Decorate(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        System.out.println("开始装饰");
        showable.show();
    }
}
