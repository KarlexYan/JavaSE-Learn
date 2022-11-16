package CloneDemo;

import java.util.regex.Pattern;

public class CloneDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int data[] = {1, 2, 3, 4, 5, 6};
        User u1 = new User("zhangsan", "123", "girl11", data);

        Object u2 = u1.clone();


        System.out.println(u1);
        System.out.println(u2);

    }
}
