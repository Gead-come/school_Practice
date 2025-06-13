package interAddrese.tcp2_3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server3 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端启动,等待数据");
        Socket accept = serverSocket.accept();

        char1 server = new char1(accept, "服务端");
        server.start();
    }


}
