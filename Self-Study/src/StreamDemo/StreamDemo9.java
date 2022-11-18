package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏",
                "张强", "张三丰", "张翠山", "张亮", "王二麻子", "谢广坤");

        // 遍历 forEach
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("===========================");

        // 统计 count
        long count = list.stream().count();
        System.out.println(count); //9

        System.out.println("===========================");

        // 收集流数据，放到数组中
        // IntFunction的泛型：具体类型的数组
        // apply的形参，流中数据的个数，要跟数组的长度保持一致
        // apply的返回值：具体类型的数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {

                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("===========================");

        // lambda
        String[] strings = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings));
    }
}
