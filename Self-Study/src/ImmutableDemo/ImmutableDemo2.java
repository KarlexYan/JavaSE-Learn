package ImmutableDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        // 创建map不可变集合，键值对超过10个

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("张三", "南京");
        hashMap.put("李四", "北京");
        hashMap.put("王五", "上海");
        hashMap.put("赵六", "北京");
        hashMap.put("孙七", "深圳");
        hashMap.put("周八", "杭州");
        hashMap.put("吴九", "宁波");
        hashMap.put("郑十", "苏州");
        hashMap.put("刘一", "无锡");
        hashMap.put("陈二", "嘉兴");
        hashMap.put("aaa", "111");

        // 利用上面数据，创建一个不可变集合
//        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        Map.Entry[] arr = new Map.Entry[0];
//        Map.Entry[] array1 = entries.toArray(arr);
//        Map.ofEntries(array1);
//        hashMap.put("bbb","12");

//        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        Map<Object, Object> objectObjectMap = Map.ofEntries(entries.toArray(new Map.Entry[0]));
//        hashMap.put("bbb","12");

        // JDK10之后才能用Map.copyOf()
        Map<String, String> map = Map.copyOf(hashMap);
        System.out.println(map);
    }
}
