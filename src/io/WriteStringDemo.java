package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fi=new FileOutputStream("fos.txt");
        //String name="是的法规和现场VB你的风格会记得吃饭VB呢对方过后就";
        String name="是的";
        byte[] by=name.getBytes(StandardCharsets.UTF_8);
        fi.write(by);

        name="12121212";
        by=name.getBytes(StandardCharsets.UTF_8);
        fi.write(by);
        System.out.println("ok");
        fi.close();
    }
}
