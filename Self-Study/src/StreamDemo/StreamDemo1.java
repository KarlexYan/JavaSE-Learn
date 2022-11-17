package StreamDemo;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
         * 把所有以“张”开头的元素存储到新集合中
         * 把“张”开头，长度为3的元素再存储到新集合中
         * 遍历打印最终结果
         * */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

//        ArrayList<String> list2 = new ArrayList<>();
//        for (String name : list1) {
//            if(name.startsWith("张") && (name.length()==3)){
//                list2.add(name);
//            }
//        }
//
//        for (String name : list2) {
//            System.out.println(name);
//        }

        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));
    }
}
