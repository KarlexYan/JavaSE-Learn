package StreamDemo;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        // 零散数据 Stream流
        // 需要使用Stream接口中的静态方法 Stream.of()

        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        Stream.of("a", "b", "c", "d", "e").forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");


        // 不同类型混合
        Stream.of(1, 2, 3, "a", "b", "c", "张三").forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        // 方法的形参是一个可变参数，可以传递一堆零散数据，可以传递数组
        // 但是数组必须是引用数据类型，如果传递基本数据类型，会把整个数组当作一个元素，放到Stream中，打印出来的是地址值
        String[] arr1 = {"a", "b", "c", "d", "e"};
        Stream.of(arr1).forEach(s -> System.out.println(s));  //a b c d e
        System.out.println("-----------------------------------");
        int[] arr2 = {1, 2, 3, 4, 5};
        Stream.of(arr2).forEach(s -> System.out.println(s));  //[I@7ba4f24f

    }
}
