package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 使用文件输出流向文件中写入文本数据
 */
public class WriteStringDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        1:创建一个文件输出流
        2:将写出的文字先转换为2进制(一组字节)
        3:关闭流
        读取文本数据
        文件流有两种创建方式:
        1:覆盖模式，对应的构造器:
        FileOutputStream(String filename)
        FileOutputStream(File file)
        所谓覆盖模式:文件流在创建是若发现该文件已存在，则会将该文件原内容全部删除。然后
        在陆续将通过该流写出的内容保存到文件中。
        2:追加模式，对应的构造器
        FileOutputStream(String filename,boolean append)
        FileOutputStream(File file,boolean append)
        当第二个参数为true时，那么就是追加模式。
        所谓追加模式:文件流在创建时若发现该文件已存在，则原内容都保留。通过当前流陆续写
        出
        的内容都会被陆续追加到文件末尾。
        */
        FileOutputStream fos = new FileOutputStream("fos.txt", true);
        String line = "斯国一!";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        line = "奥里给!";
        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕!");
        fos.close();
    }
}
