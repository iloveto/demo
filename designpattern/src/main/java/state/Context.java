package state;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }

}
