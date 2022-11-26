package FileDemo;

import java.io.File;
import java.io.IOException;

public class FilePractice4 {
    /*
     *   删除一个多级文件夹
     *   如果文件夹有内容：
     *       先删除文件夹内所有内容
     *       再删除自己
     * */

    public static void main(String[] args) throws IOException {
        // 创建点文件先
        new File("Self-Study\\FilePractice\\FilePractice1\\FilePractice2\\FilePractice3").mkdirs();
        new File("Self-Study\\FilePractice\\aaa.txt").createNewFile();
        new File("Self-Study\\FilePractice\\FilePractice1\\bbb.txt").createNewFile();
        new File("Self-Study\\FilePractice\\FilePractice1\\FilePractice2\\ccc.txt").createNewFile();
        new File("Self-Study\\FilePractice\\FilePractice1\\FilePractice2\\FilePractice3\\ddd.txt").createNewFile();

        // 删除开关，第一次用先注释一下
        delete(new File("Self-Study\\FilePractice"));
    }

    public static void delete(File src) {
        // 遍历所有内容
        File[] files = src.listFiles();

        // 判断权限
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    delete(file);
                }
            }
        }
        // 当前路径下没内容，删除自己
        src.delete();
    }
}
