package ListDemo;

public class HaskyDog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "," + getAge());
    }
}
