package interAddrese.tcp5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class b5 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);
        System.out.println("服务端启动");
        System.out.println("等待客户端连接");
        while (true) {
            Socket accept = server.accept();

            new Thread(new myRunable(accept)).start();

        }
    }
}