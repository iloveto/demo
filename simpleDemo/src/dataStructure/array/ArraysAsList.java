package dataStructure.array;

import java.util.Arrays;
import java.util.List;

/**
 * asList 不可变长
 *
 */
public class ArraysAsList {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        List list = Arrays.asList(array1);
        /**
         * 这里list.size() 大小为1
         */
        System.out.println(list.size());
        /**
         * 这里报错
         */
        list.add(4);
    }
}
