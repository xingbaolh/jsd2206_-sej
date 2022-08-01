package file;

import java.io.File;

/**
 * File可以：
 * 1：访问其表示的文件或目录的属性
 * 2：创建删除文件或空目录
 * 3：访问一个目录的子项
 * File不可以访问文件 数据
 * */
@SuppressWarnings({"all"})
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./dmeo.txt");


        //获取file表示的文件或目录的名字
        String name = file.getName();
        System.out.println(name);

        //获取当前file表示的文件大小(单位是字节)
        long length = file.length();
        System.out.println("大小："+length+"个字节");

        boolean write = file.canWrite();//是否可写
        boolean read = file.canRead();//是否可读
        System.out.println("是否可写："+write);
        System.out.println("是否可读："+read);
    }
}
