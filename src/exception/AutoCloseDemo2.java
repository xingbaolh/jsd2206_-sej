package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseDemo2 {
    public static void main(String[] args) {
        try (
                FileOutputStream file = new FileOutputStream("fos.txt");
        ) {
            file.write(1);
        } catch (IOException e) {
            System.out.println("出错了！！");
        }
    }
}
