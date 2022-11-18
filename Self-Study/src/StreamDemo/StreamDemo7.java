package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "周芷若", "赵敏",
                "张强", "张三丰", "张翠山", "张亮", "王二麻子", "谢广坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张三", "李四");

        /*
         * distinct 去重 (依赖hashCode和equals方法)
         * */
        list1.stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("===========================");

        // concat 合并 需要使用Stream接口
        Stream.concat(list1.stream(), list2.stream())
                .forEach(s -> System.out.print(s + " "));

    }
}
