package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, Painter> map;
    public Factory() {
        map = new HashMap<String, Painter>();
    }

    public Painter getPainter(String key){
        if(!map.containsKey(key)){
            switch (key){
                case "房子":
                    map.put(key, new HousePainter());
                    break;
                case "草":
                    map.put(key, new GrassPainter());
                    break;
            }
        }
        return map.get(key);
    }
}
