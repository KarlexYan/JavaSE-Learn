package LambdaDemo;

public class InsertDemo1 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int insertIndex = i;
            while (insertIndex > 0 && arr[insertIndex] < arr[insertIndex - 1]) {
                int temp = arr[insertIndex];
                arr[insertIndex] = arr[insertIndex - 1];
                arr[insertIndex - 1] = temp;
                insertIndex--;
            }
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
