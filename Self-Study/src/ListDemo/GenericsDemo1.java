package ListDemo;

public class GenericsDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("111");
        list.add("aaa");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(111);
        list2.add(3456);
        System.out.println(list2);
    }
}
