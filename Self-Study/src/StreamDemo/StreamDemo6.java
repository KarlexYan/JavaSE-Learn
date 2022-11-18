package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏",
                "张强", "张三丰", "张翠山", "张亮", "王二麻子", "谢广坤");

        //过滤
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // true表示当前数据留下
                // false表示当前数据舍弃
                return (s.startsWith("张") && s.length() == 3);
            }
        }).forEach(s -> System.out.println(s));*/

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
        System.out.println("===========================");
        //使用stream流不会影响原来数据
        System.out.print(list + " ");

        System.out.println();
        System.out.println("===========================");

        // limit 获取前几个元素
        list.stream()
                .limit(3)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("===========================");

        // skip 跳过前几个元素
        list.stream()
                .skip(3)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("===========================");
        // "张强","张三丰","张翠山"
        list.stream()
                .limit(6)
                .skip(3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("===========================");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .skip(1)
                .limit(3)
                .forEach(s -> System.out.print(s + " "));
    }
}
