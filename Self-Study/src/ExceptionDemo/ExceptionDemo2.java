package ExceptionDemo;

public class ExceptionDemo2 {

    // 异常捕获
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }

        System.out.println("test");
    }

}
