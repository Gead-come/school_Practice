package interAddrese.udp;

import java.io.IOException;
import java.net.*;

public class udpdemo {
    public static void main(String[] args) throws IOException {

             // udp的学习

        DatagramSocket sk = new DatagramSocket();  // 创建套接字

        String msg = "hello world";
        byte[] bytes = msg.getBytes();  // 字符串转字节
        InetAddress byName = InetAddress.getByName("127.0.0.1");

        int port = 8888;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, byName, port);

         sk.send(datagramPacket);
        System.out.println("发送成功");
        sk.close();

    }
}
