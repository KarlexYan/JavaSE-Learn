package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    // 方法引用（引用静态方法）
    // 需求：把String变成int类型
    public static void main(String[] args) {
        // 创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 常规方法
        list.stream()
                .map(s -> Integer.parseInt(s))
                .forEach(s -> System.out.println(s));

        System.out.println("-------------------------------------");

        // 方法引用
        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}
