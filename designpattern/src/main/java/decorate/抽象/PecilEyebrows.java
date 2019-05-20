package decorate.抽象;

public class PecilEyebrows extends AbstractDecorate {
    public PecilEyebrows(Showable showable) {
        super(showable);
    }
    @Override
    public void show() {
        System.out.println("画眉毛。。。");
        showable.show();
    }
}
