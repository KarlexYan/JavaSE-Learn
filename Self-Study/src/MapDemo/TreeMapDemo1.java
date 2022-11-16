package MapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(5, "可口可乐");
        tm.put(4, "雪碧");
        tm.put(3, "六个核桃");
        tm.put(2, "康师傅");
        tm.put(1, "奥利奥");
        // 默认以升序排序
        System.out.println(tm);

        TreeMap<Integer, String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm2.put(5, "可口可乐");
        tm2.put(4, "雪碧");
        tm2.put(3, "六个核桃");
        tm2.put(2, "康师傅");
        tm2.put(1, "奥利奥");

        System.out.println(tm2);
    }
}
