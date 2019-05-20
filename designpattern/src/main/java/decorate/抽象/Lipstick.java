package decorate.抽象;

public class Lipstick extends AbstractDecorate {

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("涂口红");
        showable.show();
    }
}
