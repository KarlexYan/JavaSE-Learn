package ExceptionDemo;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        // 如果try中可能会遇到多个问题，可以写多个catch与之对应

        // 在JDK7以后，我们可以在catch中同时捕获多个异常，中间用 | 进行隔开
        // 表示如果出现了A异常或者B异常的话，采取同一种处理方案

        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("查看是否运行");
    }
}
