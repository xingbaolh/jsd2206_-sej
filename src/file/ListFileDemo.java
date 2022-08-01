package file;

import java.io.File;

/**
 * 获取一个目录中所有的子项
 * */
public class ListFileDemo {
    public static void main(String[] args)   {
        //获取当前目录下的子项
        File file = new File(".");
        if(file.isDirectory()){//判断当前file表示的是否为一个目录
            File[] files = file.listFiles();
            System.out.println("当前目录下的子项的个数："+files.length);
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }

        /*
         boolean isFile()
         判断当前File对象是否是一个文件
          boolean isDirectory()
         判断当前File对象是否是一个目录
        * */
    }
}
