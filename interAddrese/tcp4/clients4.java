package interAddrese.tcp4;

import java.io.*;
import java.net.Socket;

public class clients4 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10086);
        System.out.println("客户端启动");
        BufferedInputStream io = new BufferedInputStream(new FileInputStream("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_001.png"));
        BufferedOutputStream ot = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while((len =io.read(bytes))!= -1){
            ot.write(bytes, 0, len);
            ot.flush();

        }
        socket.shutdownOutput();

          // 获取输入流，并读取服务器返回的消息
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = reader.readLine();
        System.out.println(s);
        System.out.println("文件传输完毕");
        io.close();
         ot.close();
        socket.close();


    }
}
