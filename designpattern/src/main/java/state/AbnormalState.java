package state;

public class AbnormalState implements State {

    @Override
    public void setState(Context context) {
        context.setState(this);
    }

    @Override
    public String toString(){
        return "AbnormalState";
    }
}
