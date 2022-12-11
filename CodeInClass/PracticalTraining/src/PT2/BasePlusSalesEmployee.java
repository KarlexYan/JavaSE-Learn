package PT2;

public class BasePlusSalesEmployee extends SalesEmployee {
    double salary;

    public BasePlusSalesEmployee(String name, int month, double salesMonth, double percentage, double salary) {
        super(name, month, salesMonth, percentage);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BasePlusSalesEmployee{" +
                "底薪为" + salary +
                "元, 月销售额为" + salesMonth +
                "元, 提成率为" + percentage +
                ", 姓名为" + name +
                ", 生日月份为" + month +
                "月}";
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + salary + percentage * salesMonth;
    }
}
