package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //删除当前目录下的test.txt文件
        //1创建一个File表示要删除的文件
        //注：在相对路径中，"./"可以忽略不写，默认就是从"./"开始的
        File file = new File("test.txt");
        if(file.exists()){
            //delete()作用就是将当前file表示的文件删除
            file.delete();
            System.out.println("文件已删除！！！");
        }else{
            System.out.println("文件不存在！！！");
        }
    }
}
