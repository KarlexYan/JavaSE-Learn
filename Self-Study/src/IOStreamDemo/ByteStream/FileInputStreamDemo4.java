package IOStreamDemo.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo4 {
    // 一次读一个字节数组数据
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Self-Study\\OutputTest.txt");

        // 一次读取多少数据，与数组的长度有关
        byte[] bytes = new byte[50];

        // 查看这次实际读取了多少字节数据
        int len = fis.read(bytes);
        System.out.println(len);

        String str = new String(bytes, 0, len);
        System.out.println(str);

        // 释放资源
        fis.close();

    }
}
