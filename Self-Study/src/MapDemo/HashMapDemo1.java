package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {

        // HashMap的键位置如果存储的是自定义对象，需要重写hashCode()和equals()
        Map<Student, String> hm = new HashMap<>();

        Student s1 = new Student("严炜轩", 22);
        Student s2 = new Student("李志浩", 21);
        Student s3 = new Student("廖廷豪", 18);
        Student s4 = new Student("严炜轩", 22);

        hm.put(s1, "东莞");
        hm.put(s2, "珠海");
        hm.put(s3, "广州");
        hm.put(s4, "山东");

        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            System.out.println(key + " , " + hm.get(key));
        }
        System.out.println("--------------------------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

        System.out.println("--------------------------------------");

        hm.forEach((student, s) -> System.out.println(student + " , " + s));
    }
}
