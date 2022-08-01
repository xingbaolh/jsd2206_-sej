package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WorkDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件中按行写入文本数据
        //1创建文件流(低级流，字节流):向文件中写入字节数据
        FileOutputStream f = new FileOutputStream("笔记本.txt");
        //2创建转换流(高级流，字符流):衔接字节与字符流，负责将写出的字符转换为字节
        OutputStreamWriter fs = new OutputStreamWriter(f, StandardCharsets.UTF_8);
        //3创建缓冲字符流(高级流，字符流):块写文本数据加速
        BufferedWriter bs = new BufferedWriter(fs);
        //4创建PrintWriter(高级流，字符流):按行写出字符串，自动行刷新
        PrintWriter ps = new PrintWriter(bs);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入(exit退出)：");
            String name = scanner.next();
            if(name.equals("exit")){
                break;
            }
            ps.println(name);
        }
        ps.close();
    }
}
