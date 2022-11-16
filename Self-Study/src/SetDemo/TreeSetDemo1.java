package SetDemo;

import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        System.out.println(ts.add(14));
        System.out.println(ts.add(12));
        System.out.println(ts.add(11));
        System.out.println(ts.add(15));
        System.out.println(ts.add(13));
//        System.out.println(ts);

        ts.forEach(integer -> System.out.print(integer + " "));
    }
}
