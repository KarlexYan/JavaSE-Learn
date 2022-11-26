package IOStreamDemo.ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    /*
     *   void write(int b)     一次写一个字节数据
     *   void write(byte[] b)     一次写一个字节数组数据
     *   void write(byte[] b, int off, int len)   一次写一个字节数组的部分数据
     * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Self-Study\\OutputTest.txt");

        // 一次写一个字节数据
        fos.write(97);

        // 回车
        fos.write(13);

        // 一次写一个字节数组数据
//        byte[] arr = "HELLO,WORLD".getBytes();
        byte[] arr = {72, 69, 76, 76, 79, 44, 87, 79, 82, 76, 68, 33};  //HELLO,WORLD!
        fos.write(arr);

        // 回车
        fos.write(13);

        // 一次写一个字节数组的部分数据
        // 数组,起始索引,个数
        fos.write(arr, 0, 5); //HELLO

        fos.close();
    }
}
