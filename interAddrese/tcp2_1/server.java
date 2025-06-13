package interAddrese.tcp2_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {

        ServerSocket sc = new ServerSocket(9999);
        System.out.println("服务端启动");
        System.out.println("等待客户端连接");
        Socket accept = sc.accept();

        InputStream inputStream = accept.getInputStream();

        BufferedReader buff = new BufferedReader(new InputStreamReader(inputStream));

        String gg;
        while((gg = buff.readLine())!=  null){
            System.out.println("客户端说"+gg);
        }
        buff.close();
        sc.close();


    }
}