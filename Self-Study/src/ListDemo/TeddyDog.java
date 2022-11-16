package ListDemo;

public class TeddyDog extends Dog {

    @Override
    public void eat() {
        System.out.println(getName() + "," + getAge());
    }
}
