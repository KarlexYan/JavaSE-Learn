package IOStreamDemo.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    // 写出一段文字到本地文件
    /*
     *   参数可以是路径也可以是对象
     *   如果文件不存在就会创建一个新文件，但需要确保父级路径存在
     *   如果文件存在，则会覆盖文件
     *
     *   资源用完需要释放，不然文件会一直处于使用状态
     * */
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileOutputStream fos = new FileOutputStream("Self-Study\\OutputTest.txt");
        // 写出资源 (int为ASCII码, 97即为a)
        fos.write(97);
        // 释放资源
        fos.close();
    }
}
