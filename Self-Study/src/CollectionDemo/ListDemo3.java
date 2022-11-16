package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // 2.增强for
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 3.Lambda表达式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });

        System.out.println();


        // 4.Lambda表达式化简
        list.forEach(s -> System.out.print(s + " "));

        System.out.println();

        // 5.普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        // 6.列表迭代器
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
