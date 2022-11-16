package MapDemo;

import SetDemo.Student2;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("严炜轩", 22);
        Student s2 = new Student("李志浩", 21);
        Student s3 = new Student("廖廷豪", 18);
        Student s4 = new Student("严炜轩", 22);

        TreeMap<Student, String> tm = new TreeMap<>();

        tm.put(s1, "广东");
        tm.put(s2, "河南");
        tm.put(s3, "湖南");
        tm.put(s4, "厕所");

        System.out.println(tm);
    }
}
