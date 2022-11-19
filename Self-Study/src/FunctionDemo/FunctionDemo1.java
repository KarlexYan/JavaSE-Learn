package FunctionDemo;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        // 创建一个数组，进行倒序排列
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        //lambda
//        Arrays.sort(arr, (o1, o2) -> o2 - o1);
//        System.out.println(Arrays.toString(arr));

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用方法的功能需要满足当前的要求
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
