package state;

/**
 * 状态模式
 * 本质：一个状态接口，多个个状态接口实现类（表示不同状态，状态实现类有可传入对象的方法，并将状态类本身设置为对象的属性）
 * ，一个拥有状态接口作为成员变量的对象（状态接口可连接不同的状态实现类）。
 */
public class Test {
    public static void main(String[] args) {
        State normalState = new NormalState();
        Context context = new Context();
        normalState.setState(context);
        System.out.println(context.toString());

        State abnormalState = new AbnormalState();
        abnormalState.setState(context);
        System.out.println(context.toString());
    }
}
