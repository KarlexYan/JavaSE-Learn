package LambdaDemo;

import java.util.Random;

public class QuickSortDemo1 {
    public static void main(String[] args) {
//        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        int[] arr = new int[1000000];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }

        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        int startIndex = start;
        int endIndex = end;

        if (startIndex > endIndex) {
            return;
        }

        int baseNumber = arr[startIndex];

        while (startIndex != endIndex) {
            while (true) {
                if (endIndex <= startIndex || arr[endIndex] < baseNumber) {
                    break;
                }
                endIndex--;
            }

            while (true) {
                if (endIndex <= startIndex || arr[startIndex] > baseNumber) {
                    break;
                }
                startIndex++;
            }

            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

        }

        int temp = arr[start];
        arr[start] = arr[startIndex];
        arr[startIndex] = temp;

        quickSort(arr, start, startIndex - 1);
        quickSort(arr, startIndex + 1, end);
    }
}
