package FileDemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {

        // 根据文件路径创建文件对象
        String str = "C:\\Users\\Karlex\\Desktop\\test.txt";
        File f1 = new File(str);
        System.out.println(f1);

        // 根据父路径名字符串和子路径名字符串创建文件对象
        String parent = "C:\\Users\\Karlex\\Desktop";
        String child = "test.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        // 根据父路径对应文件对象和子路径名字符串创建文件对象
        File parent2 = new File("C:\\Users\\Karlex\\Desktop");
        File f3 = new File(parent2, "test.txt");
        System.out.println(f3);
    }
}
