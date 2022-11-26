package FileDemo;

import java.io.File;
import java.io.IOException;

public class FilePractice1 {
    // 在当前模块下的FilePractice文件夹中创建一个 a.txt 文件
    public static void main(String[] args) throws IOException {

        // 别急，创个文件夹先
        File file = new File("Self-Study\\FilePractice");
        file.mkdirs();


        // 创建文件
        String child = "a.txt";
        File f1 = new File(file, child);
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }
}
