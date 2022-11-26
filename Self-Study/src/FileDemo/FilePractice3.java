package FileDemo;

import java.io.File;

public class FilePractice3 {
    // 定义一个方法找某一个文件夹中，是否有以自定义后缀名的文件 (考虑子文件夹)
    // 没那么多文件，就直接找当前java文件得了

    // 定义想找的路径和文件名
    static String path = "Self-Study\\src";
    static String fileName = "FilePractice";

    public static void main(String[] args) {
        File src = new File(path);
        findFiles(src);

    }


    // 获取本地所有盘符
//    public static void fineFile(){
//        File[] arr = File.listRoots();
//        for (File file : arr) {
//            findFiles(file);
//        }
//    }

    public static void findFiles(File path) {
        // 遍历路径下的内容
        File[] files = path.listFiles();

        // 如果无权限访问，会返回null
        if (files != null) {
            for (File file : files) {
                // 如果是文件
                if (file.isFile()) {
                    // 找到指定文件，打印出路径
                    if (file.getName().startsWith(fileName)) {
                        System.out.println("找到了,路径为：" + file);
                        System.out.println("绝对路径为" + file.getAbsolutePath());
                        continue;
                    }
                    // 如果是文件夹，使用递归再去遍历子文件夹下的内容
                } else {

                    findFiles(file);
                }
            }
        }
    }
}
