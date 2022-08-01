package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bfos=new BufferedOutputStream(fos);
        String line="asdfghgdiqugwludhgq";
        byte[]  bytes=line.getBytes(StandardCharsets.UTF_8);
        bfos.write(bytes);
        bfos.flush();
        System.out.println("ok");
        bfos.close();
    }
}

