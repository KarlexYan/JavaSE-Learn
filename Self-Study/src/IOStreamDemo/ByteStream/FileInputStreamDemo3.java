package IOStreamDemo.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo3 {
    // 文件拷贝
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileInputStream fis = new FileInputStream("C:\\Users\\obito\\Desktop\\猫猫头像.jpg");
        FileOutputStream fos = new FileOutputStream("Self-Study\\logo.jpg");

        // 边读边写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 释放资源,先开的最后关闭
        fos.close();
        fis.close();
    }
}
