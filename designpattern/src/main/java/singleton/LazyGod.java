package singleton;

/**
 * 懒汉模式，在初次获取god时，才创建实例
 */
public class LazyGod {
    private LazyGod lazyGod;
    private LazyGod() {

    }

    public LazyGod getGod() {
        if (lazyGod == null) {
            lazyGod = new LazyGod();
        }
        return lazyGod;
    }
}
