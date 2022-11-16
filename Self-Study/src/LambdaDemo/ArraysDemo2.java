package LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                System.out.println("o1:" + o1 + ",o2:" + o2);
//                System.out.println(Arrays.toString(arr));

                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
