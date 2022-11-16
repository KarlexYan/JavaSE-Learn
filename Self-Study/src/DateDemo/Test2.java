package DateDemo;

public class Test2 {
    public static void main(String[] args) {
        String regex = "[1-9]\\d{0,9}";
        String str = "123456789";

        if (!str.matches(regex)) {
            System.out.println("输入格式错误");
        } else {
            System.out.println("输入格式正确");
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
    }
}
