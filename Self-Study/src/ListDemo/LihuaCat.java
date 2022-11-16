package ListDemo;

public class LihuaCat extends Cat {
    @Override
    public void eat() {
        System.out.println(getName() + "," + getAge());
    }
}
