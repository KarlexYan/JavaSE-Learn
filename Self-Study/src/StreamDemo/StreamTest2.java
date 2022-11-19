package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamTest2 {

    /*
     * 创建一个ArrayList集合，并添加以下字符串，字符串前面是姓名，后面是年龄
     * 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
     * */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])))
                .forEach((s, i) -> System.out.print(s + "=" + i + " "));

    }
}
