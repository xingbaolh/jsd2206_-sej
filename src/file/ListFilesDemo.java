package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listFiles方法
 * File[] listFiles(FileFilter filter)
 * 该方法允许我们传入一个文件过滤器，
 * 然后将当前File对象表示的目录中所有的符合条件的子项返回
 * */
public class ListFilesDemo {
    public static void main(String[] args) {
        /*
        * 获取./src/file目录中所有名字含有“t”的文件
        * */
        File file = new File("./src/file");
        if(file.isDirectory()){//判断当前是否是一个目录

            /*
            使用匿名内部类创建一个文件过滤器
            * */
            FileFilter filter=new FileFilter() {
                /*
                重写accept方法(accept:接受)
                此方法的重写原则是定义过滤器过滤File的条件，当参数file
                符合此过滤器的过滤条件时，方法应当返回为true，表达过滤器接受该file
                * */
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("t");//contains包含
                    //判断file名字是否含有t字母
                }
            };

            File[] subs = file.listFiles(filter);//把当前目录的子项放在subs中
            for (int i = 0; i < subs.length; i++) {//遍历subs获取名字
                System.out.println(subs[i].getName());
            }
        }
    }
}
