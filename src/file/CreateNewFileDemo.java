package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目目录下新建一个文件：test.txt
        //1创建一个file表示要创建的文件
        File file = new File("./test.txt");
        //2判断该位置下是否已经存在这个文件或目录
        if (file.exists()) {
            System.out.println("文件已存在！");
        } else {
            //3将该文件创建出来
            file.createNewFile();
            System.out.println("文件创建成功！！！");

        }
    }
}
