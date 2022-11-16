package LambdaDemo;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int arr[] = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 81;

        System.out.println(basicSearch(arr, number));
    }

    private static int basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
