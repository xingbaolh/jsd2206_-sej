package io;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        /*
            BufferedReader提供了一个方法:
            String readLine()
            该方法可以读取一行字符串。并将这行内容返回(返回的内容最后不含有换行符)，
            如果该行为空行(只有换行符)，那么方法会返回一个空字符串
            如果流读取到了末尾，则返回值为null
         */
        String  line ;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
