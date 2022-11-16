package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {

    public static void main(String[] args) {
//        public static <T> void sort(List<T> list)
//        排序
//        public static <T> void sort(List<T> list，comparator<T> c)
//        根据指定的规则进行排序
//        public static <T> int binarySearch (List<T> list，T key)
//        以二分查找法查找元素
//        public static <T> void copy(List<T> dest, List<T> src)
//        拷贝集合中的元素
//        public static <T> int fill (List<T> list，T obj)
//        使用指定的元素填充集合
//        public static <T> void max/min(collection<T> coll)
//        根据默认的自然排序获取最大/小值
//        public static <T> void swap(List<?> list， int i， int j)
//        交换集合中指定位置的元素

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "abc", "bcd", "qwer", "1234", "5678");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
