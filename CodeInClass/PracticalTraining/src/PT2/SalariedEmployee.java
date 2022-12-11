package PT2;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }

    @Override
    public double getSalary(int month) {
        return salary + super.getSalary(month);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "月薪为" + salary +
                "元, 姓名为" + name +
                ", 生日月份为" + month +
                "月}";
    }
}


