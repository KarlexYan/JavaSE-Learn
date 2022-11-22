package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionPractice3 {
    /*
     * 需求：
     *       创建集合添加学生对象
     *       学生对象属性：name,age
     * 要求：
     *       把姓名和年龄拼接成： 张三-23的字符串，并放到数组当中
     *       使用方法引用完成
     * */

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        // 匿名内部类
//        String[] arr = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                String name = student.getName();
//                int age = student.getAge();
//                return name + "-" + age;
//            }
//        }).toArray(String[]::new);

        String[] arr = list.stream().map(Student::toString).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
