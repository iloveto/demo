package singleton;

/**
 * 饿汉模式，在类被加载时就创建实例
 */
public class EagerGod {
    private static final EagerGod eagerGod = new EagerGod();

    private EagerGod() {

    }

    public EagerGod getGod() {
        return eagerGod;
    }
}
