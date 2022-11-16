package LambdaDemo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        method(() -> {
                    System.out.println("swim");
                }
        );

        method(
                () -> {
                    System.out.println("swim");
                }
        );
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    abstract void swimming();
}