package io;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("o1.mp4");

        FileOutputStream ou=new FileOutputStream("002.mp4");

        int d;
        long start=System.currentTimeMillis();
        while ((d=in.read())!=-1){
            ou.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("时间："+(end-start)/1000+"秒");
        in.close();
        ou.close();
    }
}
