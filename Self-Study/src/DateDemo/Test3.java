package DateDemo;

public class Test3 {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(toBinaryString(number));
        System.out.println(Integer.toBinaryString(number));
    }

    public static String toBinaryString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            if (number == 0) {
                break;
            }

            int remaindar = number % 2;
            stringBuilder.insert(0, remaindar);

            number /= 2;
        }
        return stringBuilder.toString();
    }
}
