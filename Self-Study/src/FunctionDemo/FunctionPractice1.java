package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionPractice1 {

    /*
     * 需求：集合中存储一些字符串的数据，比如：张三,23
     * 收集到Student类型的数组当中
     * */
    public static void main(String[] args) {
        // 创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-16", "赵敏-17",
                "张强-18", "张三丰-19", "张翠山-20", "张亮-21", "王二麻子-22", "谢广坤-23");

        // 收集到Student类型的数组当中
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
