package StreamDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        //双列集合Stream流，无法直接使用Stream
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("张三", 23);
        hashMap.put("李四", 24);
        hashMap.put("王五", 25);
        hashMap.put("赵六", 26);
        hashMap.put("钱七", 27);

        // 需要转换成keySet或者entrySet才行
//        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
//        Stream<Map.Entry<String, Integer>> stream = entries.stream();
//        stream.forEach(Entry -> System.out.println(Entry.getKey()+"="+Entry.getValue()));
        hashMap.entrySet().stream().forEach(Entry -> System.out.println(Entry.getKey() + "=" + Entry.getValue()));
        System.out.println("--------------------------------------------------");

//        Set<String> keySet = hashMap.keySet();
//        Stream<String> stream1 = keySet.stream();
//        stream1.forEach(s -> System.out.println(s));
        hashMap.keySet().stream().forEach(s -> System.out.println(s));
    }
}
