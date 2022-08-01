package lambda;

import java.io.File;

/**
 * 用lambda表达式创建文件过滤器
 * 获取当前目录下名字含有字母o的所有子项
 */
public class Test {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles(pathname -> pathname.getName().contains("o"));
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
