package FileDemo;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        // listFiles()  获取当前该路径下所有内容
        /*
         *   当调用者File表示路径不存在时，返回null
         *   当调用者File表示路径是文件时，返回null
         *   当调用者File表示路径是一个空文件夹时，返回长度为0的数组
         *   当调用者File表示路径是一个有内容文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
         *   当调用者File表示路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         *   当调用者File表示路径需要权限才能访问的文件夹时，返回null
         * */
        File f = new File("Self-Study\\src\\");
        File[] files = f.listFiles();
//        System.out.println(files);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
