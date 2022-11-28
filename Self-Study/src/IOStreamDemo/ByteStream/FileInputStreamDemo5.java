package IOStreamDemo.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo5 {
    // 大文件拷贝
    // 为了不浪费空间还是小文件测试得了
    public static void main(String[] args) throws IOException {
        // 程序开始时间
        long start = System.currentTimeMillis();

        // 创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\obito\\Desktop\\猫猫头像.jpg");
        FileOutputStream fos = new FileOutputStream("Self-Study\\logo.jpg");

        // 边读边写
        byte[] bytes = new byte[1024 * 1024 * 10];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        // 释放资源,先开的最后关闭
        fos.close();
        fis.close();

        // 程序结束时间
        long end = System.currentTimeMillis();

        // 统计消耗时间
        System.out.println("TIMEUSED: " + (end - start) + "ms");
    }
}
