package ImmutableDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ImmutableDemo1 {
    // 不可变集合

    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list);

//        list.add("test");
//        list.remove("张三");
//        list.set(0,"aaa");
//        System.out.println(list);

        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        set.add("test");
//        set.remove("张三");
//        System.out.println(set);
    }
}
