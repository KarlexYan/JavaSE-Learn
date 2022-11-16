package DateDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("输入一个整数");
            String numStr = reader.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 100) {
                System.out.println("当前数字不在范围当中");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("已满足200要求");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
