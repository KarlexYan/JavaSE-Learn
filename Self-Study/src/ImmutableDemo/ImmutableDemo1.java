package ImmutableDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ImmutableDemo1 {
    // 不可变集合

    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list);

//        list.add("test");
//        list.remove("张三");
//        list.set(0,"aaa");
//        System.out.println(list);

        // 创建不可变Set集合，应当保证其参数的唯一性
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        set.add("test");
//        set.remove("张三");
//        System.out.println(set);


        // 创建不可变Map集合，偶数下标是键，奇数下标是值，键不能重复，参数有上限，最多二十个
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海", "赵六", "广州");
        map.forEach((s, s2) -> System.out.println(s + " = " + s2));
    }
}
