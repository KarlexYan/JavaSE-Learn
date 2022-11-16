package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "穆建平");
        map.put("尹志平", "小龙女");

//        System.out.println(map.put("韦小宝","双儿"));

        System.out.println(map.containsKey("郭靖"));
        System.out.println(map.containsValue("小龙女"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("KArlexYan"));

        map.remove("郭靖");
        System.out.println(map);

        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());


    }
}
