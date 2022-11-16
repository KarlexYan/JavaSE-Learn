package MapDemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {

        String s = "asbasakjhdahskjasdbqwbqwkqwkasdaskdbasdiqwdlqlkd";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }

        System.out.println(tm);
        System.out.println("-----------------------------");

        // 遍历集合，按照指定格式进行拼接
        StringBuilder sb = new StringBuilder();
        tm.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(") "));
        System.out.println(sb);
    }
}
