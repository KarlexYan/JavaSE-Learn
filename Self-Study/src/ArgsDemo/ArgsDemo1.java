package ArgsDemo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 654, 231);
        System.out.println(sum);
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
