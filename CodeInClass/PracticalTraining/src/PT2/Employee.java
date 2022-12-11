package PT2;

public class Employee {
    String name;
    int month;

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }


    public double getSalary(int month) {
        return month == this.month ? 100 : 0;
    }


    public String toString() {
        return "姓名：" + name + "生日月份：" + month + "}";
    }

}
