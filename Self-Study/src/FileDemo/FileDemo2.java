package FileDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
    public static void main(String[] args) {
        String str = "C:\\Users\\Karlex\\Desktop\\test.txt";
        File file = new File(str);

        // 判断此路径名表示的File是否为文件夹
        System.out.println(file.isDirectory());

        // 判断此路径名表示的File是否为文件
        System.out.println(file.isFile());

        // 判断此路径名表示的File是否存在
        System.out.println(file.exists());

        // 返回文件的大小（字节数量）,只能获取文件大小
        System.out.println(file.length());

        // 返回文件的绝对路径
        System.out.println(file.getAbsolutePath());

        // 返回定义文件时使用的路径
        System.out.println(file.getPath());

        // 返回文件的名称，带后缀
        System.out.println(file.getName());

        // 返回文件的最后修改时间（时间毫秒值）
        System.out.println(file.lastModified());
        // 转换成能看的日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date(file.lastModified());
        System.out.println(sdf.format(date));
    }
}
