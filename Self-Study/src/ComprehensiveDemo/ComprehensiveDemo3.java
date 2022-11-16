package ComprehensiveDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComprehensiveDemo3 {
    public static void main(String[] args) {
        /*
         * 班级里有5个学生 要求：
         *   被点到的学生不会再被点到。
         *   但是如果班级中所有的学生都点完了，需要重新开启第二轮点名
         * */
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜绮燕");

        for (int i = 1; i < 10; i++) {
            System.out.println("------------第" + i + "轮---------------");
            int count = list.size();
            Random rd = new Random();
            for (int j = 0; j < count; j++) {
                int index = rd.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }

            list.addAll(list2);
            list2.clear();
        }

    }
}
