package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        /*
         *   collect(Collector colletctor)  收集流中数据，放在集合中(List Set Map)
         * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-16", "赵敏-女-17",
                "张强-男-18", "张三丰-男-19", "张翠山-男-20", "张亮-男-21", "王二麻子-男-22", "谢广坤-男-23");

        // 收集到List当中  Collectors.toList
        // 收集所有 男
        List<String> list1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(list1);

        // 收集到Set当中 Collector.toSet
        // 可以去重
        Set<String> list2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(list2);

        // 收集到Map当中 Collector.toMap
        // 键为姓名，值为年龄
        // 如果要收集到Map集合当中，需要满足Map的条件，即键不重复
        list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                })).forEach(new BiConsumer<String, Integer>() {
                    @Override
                    public void accept(String s, Integer integer) {
                        System.out.print(s + "=" + integer + " ");
                    }
                });

        System.out.println();

        //lambda
        list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])))
                .forEach((s, i) -> System.out.print(s + "=" + i + " "));

    }
}
