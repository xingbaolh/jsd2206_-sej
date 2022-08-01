package file;
import java.io.File;
import java.io.FileFilter;
/**
 * 获取./src/file目录中所有名字以“D”开始的文件
 */
public class TestDemo {
    public static void main(String[] args) {
        File file = new File("./src/file");
        if (file.isDirectory()) {//判断当前是否是一个目录
            //匿名内部类的lambda简便写法
            FileFilter filter=(File file1)-> file1.getName().startsWith("D");
        /*    FileFilter filter=new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name=file.getName();
                    return name.startsWith("D");
                }
            };*/
            File[] subs = file.listFiles(file1-> file1.getName().startsWith("D"));//把当前目录的子项放在subs中
            File[] subs1 = file.listFiles(filter);//把当前目录的子项放在subs中
            for (int i = 0; i < subs.length; i++) {//遍历subs获取名字
                System.out.println(subs[i].getName());
            }
        }
    }
}
