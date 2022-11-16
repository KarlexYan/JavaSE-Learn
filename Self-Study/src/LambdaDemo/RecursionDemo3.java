package LambdaDemo;

public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(getJC(20));
    }

    public static long getJC(long number) {
        if (number == 1) {
            return 1;
        }

        return number * getJC(number - 1);
    }
}
