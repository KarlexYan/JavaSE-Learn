package ListDemo;

public class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println(getName() + "," + getAge());
    }
}
