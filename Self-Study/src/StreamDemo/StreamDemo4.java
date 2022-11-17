package StreamDemo;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {

        //数组 Stream流
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrstr = {"a", "b", "c", "d", "e"};

        Arrays.stream(arr).forEach(value -> System.out.println(value));
        System.out.println("-----------------------------------");
        Arrays.stream(arrstr).forEach(s -> System.out.println(s));
    }
}
