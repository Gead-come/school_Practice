package interAddrese.udp_3.udp_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class clients {
    public static void main(String[] args) throws IOException {

         // 组播的学习

        MulticastSocket st1 = new MulticastSocket();

        while (true) {
            System.out.println("メールを送って:" );
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if ("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            int port = 8888;
            InetAddress byName = InetAddress.getByName("224.0.01");

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, byName, port);

            st1.send(dp);  // 发送数据
        }
        st1.close();

    }
}
