package interAddrese.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class address1 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress byName = InetAddress.getByName("192.168.24.83");
        System.out.println(byName);
        // 获取本机地址与名字
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("你的主机名：" + ip.getHostName());
        System.out.println("你的IP地址：" + ip.getHostAddress());

        InetAddress localHost = InetAddress.getLocalHost();  // 获取本机地址与名字
        System.out.println("你的主机名：" + localHost.getHostName()); // 获取本机主机名
        System.out.println("你的IP地址：" + localHost.getHostAddress()); // 获取本机IP地址


        //win+e
          // 获取本机地址与名字
        InetAddress byName1 = InetAddress.getByName("DESKTOP-SIQUONE");
        System.out.println(byName1);

        String hostName = byName1.getHostName();
        System.out.println(hostName);

        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);
    }
}
