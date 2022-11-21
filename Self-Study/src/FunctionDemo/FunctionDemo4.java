package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        // 需求：集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-16", "赵敏-17",
                "张强-18", "张三丰-19", "张翠山-20", "张亮-21", "王二麻子-22", "谢广坤-23");

//        List<Student> students = list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String name = s.split("-")[0];
//                int age = Integer.parseInt(s.split("-")[1]);
//                return new Student(name, age);
//            }
//        }).collect(Collectors.toList());
//        System.out.println(students);

        // lambda
        List<Student> students = list.stream()
                .map(s -> new Student(s.split("-")[0], Integer.parseInt(s.split("-")[1])))
                .collect(Collectors.toList());
        System.out.println(students);

        // 引用方法

        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}
