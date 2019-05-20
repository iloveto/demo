package state;

public class NormalState implements State {
    @Override
    public void setState(Context context) {
        context.setState(this);
    }

    @Override
    public String toString(){
        return "NormalState";
    }
}
