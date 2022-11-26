package FileDemo;

import java.io.File;

public class FilePractice2 {
    // 定义一个方法找某一个文件夹中，是否有以自定义后缀名的文件 (不考虑子文件夹)
    public static void main(String[] args) {
        // 定义路径
        String path = "Self-Study\\FilePractice";
        // 定义后缀名
        String fileName = ".avi";
        boolean b = findFile(path, fileName);
        System.out.println(b);
    }

    public static boolean findFile(String path, String fileName) {
        File[] files = new File(path).listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(fileName)) {
                return true;
            }
        }
        return false;
    }
}
