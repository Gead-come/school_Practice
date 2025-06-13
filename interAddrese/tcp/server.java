package interAddrese.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {

             // 服务器的搭建
        ServerSocket st = new ServerSocket(8888);
        System.out.println("服务器启动");

        // 接受客户端的连接
        Socket accept = st.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));

        String gg;
       while((gg=bf.readLine())!=null){
           System.out.println("客户端说"+gg);
       }
        bf.close();
       st.close();

    }
}
