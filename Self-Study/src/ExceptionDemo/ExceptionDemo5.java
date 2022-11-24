package ExceptionDemo;

public class ExceptionDemo5 {
    // throws: 写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
    // throw: 写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。
    public static void main(String[] args) {
        // 获取数组最大值

//        int[] arr = {1,2,3,4,5,6};
//        int[] arr = null;
        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }
        System.out.println(max);

    }

    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException8*/ {
        if (arr == null) {
            throw new NullPointerException();
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("执行测试");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
