package FunctionDemo;

import StreamDemo.StringOperation;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        // 方法引用 引用成员方法


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        // 只要张开头，长度三个字
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        System.out.println("============================================");

        // 引用其他类的方法（自己写好的StringOperation)
        // 静态方法没有this，就算方法写在这个文件里也不能直接使用 this::stringJudge
        list.stream().filter(new StringOperation()::stringJudge).forEach(s -> System.out.println(s));
    }
}
