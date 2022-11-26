package FileDemo;

import java.io.File;

public class FilePractice5 {
    // 统计一个文件夹大小
    public static void main(String[] args) {

        File file = new File("Self-Study\\src");
        getLen(file);
        System.out.println(len / 1024);
    }

    static long len = 0;

    public static void getLen(File src) {
        File[] files = src.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    long length = file.length();
                    len = len + length;
                } else {
                    getLen(file);
                }
            }
        }
    }
}
