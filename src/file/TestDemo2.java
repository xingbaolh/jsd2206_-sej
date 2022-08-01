package file;

import java.io.File;
import java.io.FileFilter;

public class TestDemo2 {
    public static void main(String[] args) {
        File file = new File("./src/file");
        if(file.isDirectory()){
            FileFilter filter=new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String name = pathname.getName();
                    return name.endsWith("o.java");
                }
            };

            File[] files = file.listFiles(filter);
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
    }
}
