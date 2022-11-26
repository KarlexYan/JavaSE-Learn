package FileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FilePractice6 {
    // 统计一个文件夹中每种文件的个数并打印（考虑子文件夹）
    public static void main(String[] args) {

        // 路径
        String path = "Self-Study\\src";
        File file = new File(path);
        HashMap<String, Integer> hm = getCount(file);
        hm.forEach((s, count) -> System.out.println(s + " = " + count));

    }


    public static HashMap<String, Integer> getCount(File src) {
        // 定义集合用于统计
        HashMap<String, Integer> hm = new HashMap<>();
        // 进入文件夹
        File[] files = src.listFiles();
        // 遍历
        for (File file : files) {
//            System.out.println(file);
            // 如果是文件
            if (file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)) {
                        // 存在
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    } else {
                        // 不存在
                        hm.put(endName, 1);
                    }
                }

                // 如果是文件夹，递归
            } else {
                // sonMap里面是子文件中每一种文件的个数
                HashMap<String, Integer> sonMap = getCount(file);

                // 遍历sonMAp把里面的值累加到hm当中
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    // 获取sonMap的key和value
                    String key = entry.getKey();
                    int value = entry.getValue();

                    // 判断sonMap和hm之间是否有重复的键值
                    if (hm.containsKey(key)) {
                        // 存在 获取hm里面原有的count加上sonMap里面的count
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key, count);
                    } else {
                        // 不存在 直接合并到hm
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }


}
