package ListDemo;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

//        method(list1);
//        method(list2);
//        method(list3);

        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

    }

    public static void method(ArrayList<Ye> list) {

    }
}

class Ye {

}

class Fu extends Ye {

}

class Zi extends Fu {

}
