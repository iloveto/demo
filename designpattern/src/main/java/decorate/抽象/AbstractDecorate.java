package decorate.抽象;

public abstract class AbstractDecorate implements Showable{
    protected Showable showable;

    public AbstractDecorate(Showable showable) {
        this.showable = showable;
    }

    public abstract void show();
}
