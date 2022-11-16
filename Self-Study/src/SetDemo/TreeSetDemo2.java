package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s3);
        ts.add(s1);
        ts.add(s2);
        System.out.println(ts);

//        Iterator<Student> it  = ts.iterator();
//        while(it.hasNext()){
//            Student next = it.next();
//            System.out.println(next);
//        }

//        for (Student t : ts) {
//            System.out.println(t);
//        }

//        ts.forEach(student -> System.out.println(student));
    }
}
