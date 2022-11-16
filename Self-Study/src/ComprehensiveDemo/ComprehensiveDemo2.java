package ComprehensiveDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComprehensiveDemo2 {
    public static void main(String[] args) {
        /*班级里有N个学生，要求：
        70%概率随机到男生，30%概率随机到女生*/

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);
        Random rd = new Random();
        int number = list.get(rd.nextInt(list.size()));
//        System.out.println(number);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼腾", "朱益群", "珠穆朗玛峰");
        Collections.addAll(girlList, "杜绮燕", "袁明缘", "田蜜蜜", "李蔡");
        if (number == 1) {
            System.out.println(boyList.get(rd.nextInt(boyList.size())));
        } else {
            System.out.println(girlList.get(rd.nextInt(girlList.size())));
        }
    }
}
