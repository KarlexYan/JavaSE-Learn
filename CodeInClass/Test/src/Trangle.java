public class Trangle {
    int a, b, c;

    public Trangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean pan(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a - b < c && a - c < b && b - c < a) {
                return true;
            } else return false;
        } else return false;
    }

    public int len(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Trangle tra = new Trangle(3, 4, 5);
        System.out.println(tra.len(3, 4, 5));
    }
}
