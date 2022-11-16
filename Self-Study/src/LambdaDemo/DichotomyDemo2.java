package LambdaDemo;

public class DichotomyDemo2 {
    public static void main(String[] args) {
        int arr[] = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 103;
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int arr[], int number) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        while (true) {
            if (minIndex > maxIndex) {
                return -1;
            }

            int midIndex = (minIndex + maxIndex) / 2;
            if (arr[midIndex] > number) {
                maxIndex = midIndex - 1;
            } else if (arr[midIndex] < number) {
                minIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
    }
}
