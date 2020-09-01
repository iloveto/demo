package collection.treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        treeMap.put(4, "d");

        //删除key
        treeMap.remove(4);
        System.out.println(treeMap.size());

        treeMap.forEach(((integer, s) -> System.out.println(integer+"->"+s)));

    }
}
