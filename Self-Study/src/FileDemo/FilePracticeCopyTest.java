package FileDemo;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FilePracticeCopyTest {
    public static void main(String[] args) {

        String path = "Self-Study\\src";
        File file = new File(path);
        HashMap<String, Integer> hm = getCount(file);
        hm.forEach((s, integer) -> System.out.println(s + " = " + integer));

    }

    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String[] arr = file.getName().split("\\.");
                    if (arr.length >= 2) {
                        String endName = arr[arr.length - 1];
                        if (hm.containsKey(endName)) {
                            //存在
                            Integer count = hm.get(endName);
                            count++;
                            hm.put(endName, count);
                        } else {
                            // 不存在
                            hm.put(endName, 1);
                        }
                    }
                } else {
                    HashMap<String, Integer> sonMap = getCount(file);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if (hm.containsKey(key)) {
                            //存在
                            Integer count = hm.get(key);
                            count = count + value;
                            hm.put(key, count);
                        } else {
                            // 不存在
                            hm.put(key, value);
                        }
                    }
                }
            }
        }
        return hm;
    }
}
