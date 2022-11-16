package LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo4 {
    public static void main(String[] args) {
        String[] arr = {"aaaa", "aa", "aaa", "a"};

//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
        Arrays.sort(arr, (x, y) -> y.length() - x.length());
        System.out.println(Arrays.toString(arr));

    }
}
