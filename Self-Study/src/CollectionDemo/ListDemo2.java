package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        list.remove(0);
        Integer i = Integer.valueOf(1);

        list.remove(i);
        System.out.println(list);

    }
}
