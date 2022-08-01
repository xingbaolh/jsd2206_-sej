package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("pw.txt");
        pw.println("眼睛");
        pw.println("眼镜");
        System.out.println("ok");
        pw.close();
    }
}
