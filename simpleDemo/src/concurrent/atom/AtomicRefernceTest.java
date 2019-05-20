package concurrent.atom;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 原子更新引用类型
 */
public class AtomicRefernceTest {
    public static AtomicReference<User> atomicReference = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User("Lily", 13);
        User user2 = new User("Lily", 13);
        User newUser = new User("Delicacy", 23);
        atomicReference.set(user);
        atomicReference.compareAndSet(user, newUser);
        System.out.println(atomicReference.get().getName());
    }

    static class User {
        private String name;
        private int age;

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
