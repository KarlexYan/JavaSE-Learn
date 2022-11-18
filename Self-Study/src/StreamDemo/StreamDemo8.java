package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        /*
         * map  转换流中的数据类型
         *
         * 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
         * 注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
         * */

        //String -> int
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-16", "赵敏-17",
                "张强-18", "张三丰-19", "张翠山-20", "张亮-21", "王二麻子-22", "谢广坤-23");

        // 第一个类型：流中原本的数据类型，第二个类型，要转成之后的类型
        list.stream().map(new Function<String, Integer>() {
            //形参s代表流里面每一个数据
            //返回值表示转换之后的数据
            @Override
            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String ageString = arr[1];
//                int age = Integer.parseInt(ageString);
//                return age;
                return Integer.parseInt(s.split("-")[1]);
            }
        }).forEach(integer -> System.out.print(integer + " "));

        System.out.println();
        System.out.println("===========================");

        // lambda yyds
        list.stream()
                .map(s -> Integer
                        .parseInt(
                                s.split("-")[1]))
                .forEach(i -> System.out.print(i + " "));
    }
}
