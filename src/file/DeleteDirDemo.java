package file;

import java.io.File;

/**
 * 删除一个目录
 * delete在删除前提是该目录必须为空
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //删除当前目录下的demo目录
        File demo = new File("demo");
        if (demo.exists()) {
            demo.delete();
            System.out.println("ok");
        } else {
            System.out.println("不存在！");
        }
    }
}
