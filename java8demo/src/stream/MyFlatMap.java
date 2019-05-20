package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 使用flapmap将
 */
public class MyFlatMap {
    public static void main(String[] args) {
        String[] array = {"Goodbye", "World"};
        List<String> list = Arrays.asList(array);
        List<String> list2 = list.stream().map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("1221212");

        Integer[] num = {1, 2, 3, 4};
        List<Integer> intArray = Arrays.asList(num);
        List<Integer> newIntArray = intArray.stream().map(s -> s * s).collect(Collectors.toList());
        System.out.println(newIntArray);

    }
}
