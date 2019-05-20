package lambda.fangFaYingYong.shiLiFangFa;

import java.util.Arrays;

/**
 *     t::compareByName   一个对象的方法应用
 */
public class Test {
    public int compareByName(Person a,Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static void main(String[] args) {
        Test t = new Test();
        Person[] personArray = new Person[3];
        personArray[0] = new Person(1, "haha");
        personArray[1] = new Person(2, "jack");
        personArray[2] = new Person(3, "babala");
        Arrays.sort(personArray,t::compareByName);
        System.out.println(personArray);

        /**
         * 类的方法引用
         */
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        System.out.println("类的方法引用");
    }
}
