package interAddrese.tcp2_1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class clients {
    public static void main(String[] args) throws IOException {

    Socket socket = new Socket("127.0.0.1",  9999);
        System.out.println("客户端启动");
    OutputStream tp = socket.getOutputStream();
    PrintWriter pw = new PrintWriter(tp,true);
    Scanner sc = new Scanner(System.in);
        System.out.println("输入你要说话");
       while(true){
        String line = sc.nextLine();
        pw.println(line);
        if ("886".equals(line))break;
    }
       pw.close();
       socket.close();
}
}
