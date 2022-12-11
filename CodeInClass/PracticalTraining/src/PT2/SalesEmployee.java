package PT2;

public class SalesEmployee extends Employee {
    double salesMonth;
    double percentage;

    public SalesEmployee(String name, int month, double salesMonth, double percentage) {
        super(name, month);
        this.salesMonth = salesMonth;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "月销售额" + salesMonth +
                "元, 提成率为" + percentage +
                ", 姓名为" + name +
                ", 生日月份为" + month +
                "月}";
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + salesMonth * percentage;
    }
}
