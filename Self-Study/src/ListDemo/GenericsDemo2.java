package ListDemo;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list);
    }
}
