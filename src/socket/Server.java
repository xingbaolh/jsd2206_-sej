package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            System.out.println("等待连接...");
            Socket socket=serverSocket.accept();
            System.out.println("客户以连接！");
            InputStream in= socket.getInputStream();
            InputStreamReader is = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader bu=new BufferedReader(is);
            String line;
            while ((line=bu.readLine())!=null) {
                System.out.println("客户端说:" + line);
            }
            System.out.println("聊天已退出！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
