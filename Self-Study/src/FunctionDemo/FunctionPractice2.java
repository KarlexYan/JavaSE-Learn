package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionPractice2 {
    // 需求：创建集合添加学生对象，学生对象属性：name,age 只获取姓名并放到数组当中
    // 要求：使用方法引用完成
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

//        String[] arr = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName();
//            }
//        }).toArray(String[]::new);
//
//        System.out.println(Arrays.toString(arr));

        //方法引用
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
