package file;

import java.io.File;

/**
 * mark:做
 * directory:目录
 * 创建目录
 * */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录：demo
        File demo = new File("a/d/c");
        if(demo.exists()){
            demo.delete();
            System.out.println("该目录已存在！！！");
        }else{
            demo.mkdirs();//创建多级目录
            System.out.println("该目录已创建！！！");
        }
    }
}
