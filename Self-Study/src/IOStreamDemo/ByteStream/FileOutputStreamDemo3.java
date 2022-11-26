package IOStreamDemo.ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    /*
     * 换行写:
     *   Windows:    \r\n
     *   Linux:      \n
     *   Mac:        \r
     *   在Windows中，java对回车换行进行了优化，只需要写\r或\n即可实现
     *   建议不要省略
     *
     * 续写:
     *   每次创建对象不会覆盖，直接追加写入
     *   需要打开续写开关，即创建对象时的第二个参数，默认false，手动加上true即可打开
     * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Self-Study\\OutputTest.txt", true);

        String str = "KarlexYan's CodeStuff";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        // 换行，写新的一句话
        fos.write("\r\n".getBytes());
        fos.write("Enter Test".getBytes());

        fos.close();
    }
}
