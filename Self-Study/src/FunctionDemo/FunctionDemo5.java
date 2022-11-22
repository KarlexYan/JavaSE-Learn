package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo5 {
    //方法引用  （类名引用成员方法）
    //格式  类名::成员方法
    public static void main(String[] args) {
        //需求：集合里面一些字符串，要求变成大写后进行输出

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

        //lambda
        list.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));

        /*
         * 方法引用的规则：
         * 1.需要有函数式接口
         * 2.被引用的方法必须已经存在
         * 3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致。
         * 4.被引用方法的功能需要满足当前的需求
         *
         * 第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用方法需要是无参的成员方法
         * */

        //方法引用
        list.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
    }
}
