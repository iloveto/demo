package list.removeDuplicate;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * List去重，
 * 重写对象的equals和hashcode方法
 *
 * 去重的方法有
 *  java8 distinct
 *  hashmap
 *  set去重
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        People p1 = new People();
        p1.setId(1);
        p1.setName("小敏");
        People p2 = new People();
        p2.setId(1);
        p2.setName("小敏");
        People p3 = new People();
        p3.setId(3);
        p3.setName("小美");

        List<People> list = Arrays.asList(p1, p2, p3);

//        Set<People> set = new HashSet<>();
//        List newList = new ArrayList();
//        set.addAll(list);
//        newList.addAll(set);
//        System.out.println(newList);

        //java8 去重
//        list.stream().distinct().collect(Collectors.toList());


        Map<String, People> map = new HashMap<>();
    }
}
