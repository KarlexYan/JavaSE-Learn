package PT2;

public class HourlyEmployee extends Employee {
    double hoursSalary;
    int hoursWork;

    public HourlyEmployee(String name, int month, double hoursSalary, int hoursWork) {
        super(name, month);
        this.hoursSalary = hoursSalary;
        this.hoursWork = hoursWork;
    }


    @Override
    public double getSalary(int month) {

        if (hoursWork > 160) {
            return (1.5 * hoursSalary * hoursWork - 80 * hoursSalary) + super.getSalary(month);
        } else {
            return (hoursSalary * hoursWork) + super.getSalary(month);
        }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "时薪为" + hoursSalary +
                "元, 本月工作小时数为" + hoursWork +
                ", 姓名为" + name +
                ", 生日月份为" + month +
                "月}";
    }
}
