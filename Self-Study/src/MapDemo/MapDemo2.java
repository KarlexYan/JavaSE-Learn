package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "穆建平");
        map.put("尹志平", "小龙女");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "," + map.get(key));

        }
    }
}
