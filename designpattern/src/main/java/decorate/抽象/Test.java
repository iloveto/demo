package decorate.抽象;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        new Lipstick(new PecilEyebrows(new Girl())).show();
        new PecilEyebrows(new Lipstick(new Girl())).show();
    }
}
