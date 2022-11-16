package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");

//        Iterator<String> it = set.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }

//        for (String s : set) {
//            System.out.println(s);
//        }

        set.forEach(s -> System.out.println(s));
    }
}
