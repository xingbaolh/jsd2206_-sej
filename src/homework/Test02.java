package homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成一个转码工具。
 * 比如当前项目目录下有一个文本文件note.txt，字符串编码
 * 是GBK的，现在需要将这个文件内容转换为UTF-8编码，并将其
 * 写出到文件note_utf.txt中。
 * 单词记一记：
 * note 笔记
 * 思路:
 * 用GBK编码将note.txt文件内容读取出来，再以UTF-8编码写入
 * 到note_utf.txt中
 * 要点:
 * 组建流连接时，输入流中的转换流指定为GBK编码。最终用缓冲
 * 输入流按行读取字符串。
 * 组件输出流中的转换流时指定为UTF-8编码，最终按行写出时
 * 就可以了。
 * 最终程序可以扩展为，读取的文件名可以让用户在控制台输入，
 * 该文件的字符集也可以指定。然后想转换为什么字符集也可以
 * 指定，并最终写入一个新文件。这样就可以随意使用了。
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("要读取的文件！");
        String name = scanner.nextLine();//控制台读取文件*/
        FileInputStream fis = new FileInputStream("./src/homework/note.txt");
        InputStreamReader fi = new InputStreamReader(fis, "GBK");
        BufferedReader bus = new BufferedReader(fi);
        System.out.println("转码到文件：");
        String name1 = scanner.nextLine();//控制台读取文件
        FileOutputStream fos = new FileOutputStream(name1);

        OutputStreamWriter ows = null;
        System.out.println("选择转码类型GBK,UTF-8");
        String type = scanner.nextLine();
        if ("GBK".equals(type)) {
            ows = new OutputStreamWriter(fos, "GBK");
        } else if ("UTF-8".equals(type)) {
            ows = new OutputStreamWriter(fos, "UTF-8");
        }
        BufferedWriter buw = new BufferedWriter(ows);
        PrintWriter pw = new PrintWriter(buw, true);
        String line;
        while ((line = bus.readLine()) != null) {
            pw.println(line);
        }
        System.out.println("请添加内容：");
        while (true) {
            String str = scanner.nextLine();
            if ("exit".equals(str)) {
                break;
            }

        }
        System.out.println("ok");
        buw.close();
        pw.close();
    }
}