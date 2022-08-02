package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    private Socket socket;//套接字

    public Client() {//构造方法
        /*
         * Socket实例化需要传入俩个参数
         * 参数1：服务器的地址信息
         * 参数2：服务器打开的服务器端口
         * 客户端通过服务端的地址找到网络上的服务器计算机，通过端口可以连接上该机器上的运行的服务器应用程序
         * */
        try {
            System.out.println("聊天开始：");
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        Scanner scanner=new Scanner(System.in);
        //客户端向服务端发送数据，则使用socket获取输出流
        try {
            OutputStream ou=socket.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(ou, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(ow);
            PrintWriter pw=new PrintWriter(bw,true);
            while(true){
                System.out.println("输入内容：");
                String content=scanner.nextLine();
                if("exit".equals(content)){
                    pw.close();
                    System.out.println("聊天结束");
                    break;
                }
                pw.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
