public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(5, 5), new Rectangle(5, 5), new Circular(5)};
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }
}

abstract class Shape {
    abstract double getArea();
}

class Triangle extends Shape {
    private double bottom;
    private double high;

    public Triangle(double bottom, double high) {
        this.bottom = bottom;
        this.high = high;
    }

    @Override
    double getArea() {
        return (bottom * high) * 0.5;
    }
}

class Rectangle extends Shape {
    private double l;
    private double h;

    public Rectangle(double l, double h) {
        this.l = l;
        this.h = h;
    }

    @Override
    double getArea() {
        return l * h;
    }
}

class Circular extends Shape {
    private double r;

    public Circular(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}
