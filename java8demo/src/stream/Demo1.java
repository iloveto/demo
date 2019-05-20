package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {

        //筛选各异的元素 distinct
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        //截断流 limit
        System.out.println("截断流");
        list.stream().filter(i -> i % 2 == 0).limit(3).forEach(System.out::println);

        //跳过n个元素 skip(n)
        System.out.println("跳过n个元素");
        list.stream().skip(2).forEach(System.out::println);

        //映射
        Entity e1= new Entity();
        e1.setName("苹果饼");
        Entity e2= new Entity();
        e2.setName("小份水果蛋糕");
        List<Entity> foodlist = Arrays.asList(e1, e2);
        System.out.println("水果：");
        List<Integer> s = foodlist.stream().map(Entity::getName).map(String::length).collect(Collectors.toList());

        //流的扁平化  flapmap你把一个流中的每个值都换成另一个流，然后把所有的流连接起来成为一个流
        String[] arrayOfWords = {"Goodbye", "World"};
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> uniqueCharacters =
                words.stream()
                        .map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList());

        //归约
        //元素求和,reduce(初始值,BinaryOperator<T>)

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        int sum = numList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduce求和："+sum);


    }



}
