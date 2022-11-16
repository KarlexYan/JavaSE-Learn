package ComprehensiveDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComprehensiveDemo1 {
//     有N个学生，学生属性：姓名，年龄，性别
//        实现随机点名

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜绮燕", "宋合泛", "侯笼腾", "朱益群", "珠穆朗玛峰", "袁明缘");

//        Random rd = new Random();
//        String name = list.get(rd.nextInt(list.size()));
//        System.out.println(name);

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
