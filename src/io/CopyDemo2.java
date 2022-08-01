package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("o1.mp4");
        FileOutputStream fos = new FileOutputStream("o1_cp.mp4");
        byte[] data = new byte[1024*10];//10kb
        int len = 0;//记录每次实际读取的字节数
        long start = System.currentTimeMillis();
        while( (len = fis.read(data)) != -1  ){
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(end-start)+"ms");

        fis.close();
        fos.close();
    }
}
