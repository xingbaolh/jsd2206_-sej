package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前目录下创建100个文件，命名test1.txt-----test100.txt
 */
public class Test {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            File file = new File("test" + (i + 1) + ".txt");
            if (file.exists()) {//文件存在删除
                file.delete();
                System.out.println("文件删除！！");
            } else {//不存在就创建
                file.createNewFile();
                System.out.println("文件创建成功！！！");
            }
        }
    }
}
