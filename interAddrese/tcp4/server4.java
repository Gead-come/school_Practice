package interAddrese.tcp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server4 {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(10086);
        System.out.println("服务端启动");
        System.out.println("等待客户端连接");
        Socket accept = server.accept();
        System.out.println("客户端连接成功");
        BufferedInputStream io = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream it = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Webデザイン科\\Desktop\\lalalalal\\新しいフォルダー\\111\\img_022.png"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = io.read(bytes))!= -1){
            it.write(bytes, 0, len);

        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("文件上传成功");
        bw.newLine();   // 刷新缓冲区
        bw.flush();


        accept.close();
        server.close();


    }
}
