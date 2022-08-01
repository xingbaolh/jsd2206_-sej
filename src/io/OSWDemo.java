package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        String line="super 你的笑容最甜";
        osw.write(line);
        osw.write("八月正午的阳光！！！");
        System.out.println("ok");
        osw.close();
    }
}
