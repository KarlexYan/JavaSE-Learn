package PT2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee[] emp = {
                new SalariedEmployee("张三", 3, 2500.0),
                new HourlyEmployee("李四", 4, 20, 180),
                new SalesEmployee("王五", 5, 75000, 0.15),
                new BasePlusSalesEmployee("赵六", 6, 5000, 0.15, 2000)
        };

        while (true) {
            System.out.println("请输入当前月份：");
            int month = new Scanner(System.in).nextInt();
            if (month > 12 || month < 1) {
                System.out.println("当前输入月份有误，请重新输入");
                continue;
            } else {
                for (int i = 0; i < emp.length; i++) {
                    System.out.println(emp[i].toString());
                    System.out.println(month + "月应发工资：" + emp[i].getSalary(month));
                    System.out.println("=========================================");
                }
            }
            break;
        }
    }
}
