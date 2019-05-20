package concurrent.atom;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 原子更新字段类
 * AtomicIntegerFieldUpdater
 * AtomicLongFieldUpdater
 * AtomicStampedReference
 *
 * 案例 对user的年龄增加一岁
 *
 * 1更新类的要更新的字段需要使用public volatile修饰
 * 2创建更新器，使用更新器更新
 */
public class AtomicIntegerFieldUpdaterTest {
    private static AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class, "age");

    public static void main(String[] args) {
        User user = new User("Delicacy", 13);
        a.getAndIncrement(user);
        System.out.println(a.get(user));
        a.getAndIncrement(user);
        System.out.println(a.get(user));
        System.out.println(user.getAge());
    }
    static class User {
        private String name;
        public volatile int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
