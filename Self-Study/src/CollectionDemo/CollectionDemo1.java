package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection);


        System.out.println(collection.remove("bbb"));
        System.out.println(collection.remove("ddd"));
        System.out.println(collection);

        System.out.println(collection.contains("aaa"));
        System.out.println(collection.contains("EEE"));

        System.out.println(collection.isEmpty());

        System.out.println(collection.size());

        collection.clear();
        System.out.println(collection);

        System.out.println(collection.isEmpty());
    }
}
