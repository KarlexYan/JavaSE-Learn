package ExceptionDemo;

public class ExceptionDemo4 {
    /*
     *  getMessage()  返回throwable的详细消息字符串
     *  toString()    返回可抛出的简短描述
     *  printStackTrace()  把异常的错误信息输出在控制台
     * */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

//        try {
//            System.out.println(arr[10]);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        System.out.println("测试执行");
    }
}
