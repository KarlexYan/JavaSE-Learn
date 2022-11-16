package ListDemo;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        ArrayList<Student2> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);

//        method(list4);
    }

    public static <E> void method(ArrayList<? extends Ye> list) {

    }
}

class Student2 {
}
