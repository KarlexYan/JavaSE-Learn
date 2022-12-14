package IOStreamDemo.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
    // 读取文件中的数据
    // 读不到会返回-1
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileInputStream fis = new FileInputStream("Self-Study\\OutputTest.txt");

        // 读取数据
        // 一次只读取一个字节，读出来的是ASCII上对应的数字
        int read = fis.read();

        System.out.println((char) read);

        // 释放资源
        fis.close();
    }
}
