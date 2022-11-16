package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
