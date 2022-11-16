package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1, "qqq");
        System.out.println(list);

        list.remove("qqq");
        System.out.println(list);

        String result = list.set(0, "QQQ");
        System.out.println(list);

    }
}
