package LambdaDemo;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("-------------toString--------------");
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------binarySearch--------------");
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 20));

        System.out.println("-------------copyOf--------------");
        int[] newArr = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(newArr));

        System.out.println("-------------copyOfRange--------------");
        int[] newArr2 = Arrays.copyOfRange(arr, 2, 8);
        System.out.println(Arrays.toString(newArr2));

        System.out.println("-------------fill--------------");
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------sort--------------");
        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
