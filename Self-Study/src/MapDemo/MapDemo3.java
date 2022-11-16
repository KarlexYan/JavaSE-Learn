package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "尹志平");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry + "," + entry.getKey() + "," + entry.getValue());
        }
        System.out.println("----------------------------------");

        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------------------");

        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry));
        System.out.println("----------------------------------");
        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
