package MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("aaa", 123);
        lhm.put("aaa", 111);
        lhm.put("bbb", 456);
        lhm.put("ccc", 789);

        System.out.println(lhm);
    }
}
