package MapDemo;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        /*
            班级80人，需要组成秋游活动，
            班长提供四个景点，分别是ABCD，
            每个学生只能选择一个经典，统计出最终哪个景点想去的人数最多。
         */

        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            int index = rd.nextInt(arr.length);
            list.add(arr[index]);
        }
//        list.forEach(s -> System.out.println(s));

        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : list) {
            if (hm.containsKey(s)) {
                Integer count = hm.get(s);
                count++;
                hm.put(s, count);
            } else {
                hm.put(s, 1);
            }
        }
        System.out.println(hm);
//        hm.forEach((s, integer) -> System.out.println(s + "," + integer));

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);

        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
