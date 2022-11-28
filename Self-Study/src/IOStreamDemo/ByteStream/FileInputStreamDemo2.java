package IOStreamDemo.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {
    //  字节输入流循环读取
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileInputStream fis = new FileInputStream("Self-Study\\OutputTest.txt");

        // 循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        // 释放资源
        fis.close();
    }
}
