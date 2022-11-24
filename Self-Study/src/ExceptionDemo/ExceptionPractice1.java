package ExceptionDemo;

import javax.naming.Name;
import java.util.Scanner;

public class ExceptionPractice1 {
    /*
     * 需求：
     *   键盘录入自己心仪的女朋友姓名和年龄。
     *   姓名的长度在3 - 10之间，
     *   年龄的范围为18 - 40岁，
     *   超出这个范围属于异常数据不能赋值，需要重新录入，一直录到正确为止
     *
     * 提示：
     *   需要考虑用户在键盘录入时的所有情况
     *   比如：录入年龄时超出范围，录入年龄时录入了abc等情况。
     * */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        GirlFriends gf = new GirlFriends();

        while (true) {
            try {
                System.out.println("输入名字：");
                String name = reader.nextLine();
                gf.setName(name);

                System.out.println("输入年龄：");
                String ageStr = reader.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //满足所有条件，跳出循环
                System.out.println("录入成功");
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            } catch (NameFormatException e) {
                e.printStackTrace();
                continue;
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                continue;
            }
        }

        System.out.println(gf);
    }
}
