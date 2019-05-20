package proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticProxy implements Internet{
    private Modem modem = new Modem();
    private static List<String> blackList = Arrays.asList("游戏", "电影");

    public void access(String url) {
//        blackList.stream().filter(s -> {if(s.equalsIgnoreCase(url)){
//            return null;
//        }});
        for (String blackAddress : blackList) {
            if (url.contains(blackAddress)) {
                System.out.println("包含违禁地址，禁止访问");
                return;
            }
        }
        modem.access(url);
    }
}
