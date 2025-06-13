package interAddrese.udp_2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class clients {
    public static void main(String[] args) throws IOException {

        DatagramSocket st1 = new DatagramSocket();

        while (true) {
            System.out.println("メールを送って:" );
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if ("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            int port = 8888;
            InetAddress byName = InetAddress.getByName("127.0.0.1");

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, byName, port);

            st1.send(dp);  // 发送数据
        }
        st1.close();

    }
}
