package interAddrese.udp_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server {
    public static void main(String[] args) throws IOException {

        DatagramSocket ts = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];

        DatagramPacket fp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ts.receive(fp);

            byte[] data = fp.getData();
            String hostAddress = fp.getAddress().getHostAddress();
            int port = fp.getPort();
            int length = fp.getLength();
            String hostName = fp.getAddress().getHostName();
            System.out.println("来自 " + hostAddress + hostName  + ":" + port + " 的消息:");
            System.out.println(new String(data, 0, length));
        }


    }
}
