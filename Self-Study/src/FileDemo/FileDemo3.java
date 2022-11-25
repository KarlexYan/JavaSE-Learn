package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建一个新的空文件
        /*
         *   如果当前路径表示的文件是不存在的，则创建成功
         *   如果当前路径表示的文件是存在的，则创建失败
         *   如果父级路径不存在，会有异常IOException
         *   createNewFile方法创建的一定是文件，即使没有后缀
         * */
        File f1 = new File("Self-Study\\FileTest\\createTest.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        // 创建单级文件夹
        /*
         *   Windows 路径唯一，如果当前路径已存在（或有重名文件），则创建失败
         *   mkdir只能创建单级文件夹，不能创建多级文件夹
         * */
        File f2 = new File("Self-Study\\FileTest\\mkdirTest");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);

        // 创建多级文件夹
        /*
         *   mkdirs可以创建多级文件夹，也能创建单级文件夹
         * */
        File f3 = new File("Self-Study\\FileTest\\mkdirsTest1\\mkdirsTest2");
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);

        // 删除文件或文件夹
        /*
         *   如果删除的是文件，直接删除，不进入回收站
         *   如果删除的是空文件夹，直接删除，不进入回收站
         *   如果删的的文件夹下有内容，删除失败
         * */
//        File f4 = new File("Self-Study\\FileTest\\createTest.txt");
//        boolean delete = f4.delete();
//        System.out.println(delete);
    }
}
