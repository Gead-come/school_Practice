package interAddrese.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpdemo2 {
    public static void main(String[] args) throws IOException {

        DatagramSocket st = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];

        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        System.out.println("等待接收数据");

          st.receive(packet);  // 接收数据，阻塞方法，直到有数据，才会执行下面的代码
        System.out.println("接收中");

          // 获取数据
        String s = new String(packet.getData(), 0, packet.getLength());
        System.out.println(s);

        System.out.println("来自 " + packet.getAddress().getHostAddress() +
                ":" + packet.getPort() + " 的消息:");
        System.out.println(s);


        st.close();


    }
}
