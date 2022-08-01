package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("o1.mp4");
        BufferedInputStream bin=new BufferedInputStream(in);
        FileOutputStream ou=new FileOutputStream("002.mp4");
        BufferedOutputStream bou=new BufferedOutputStream(ou);
        int d;
        long start=System.currentTimeMillis();
        while ((d=bin.read())!=-1){
            bou.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("时间："+(end-start)/1000+"秒");
        bin.close();
        bou.close();
    }
}
