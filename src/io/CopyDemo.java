package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用文件输入流与输出流实现文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //用文件输入流读取待复制的文件
        // FileInputStream fis = new FileInputStream("image.jpg");
        FileInputStream fis = new FileInputStream("01.rmvb");
        //用文件输出流向复制文件中写入复制的数据
        // FileOutputStream fos = new FileOutputStream("image_cp.jpg");
        FileOutputStream fos = new FileOutputStream("01_cp.rmvb");
        int d;//先定义一个变量，用于记录每次读取到的数据
        long start = System.currentTimeMillis();//获取当前系统时间
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:" + (end - start) + "ms");
        fis.close();
        fos.close();
    }
}
