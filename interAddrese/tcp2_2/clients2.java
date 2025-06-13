package interAddrese.tcp2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class clients2 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);
        System.out.println("客户端启动");


        new Thread(() -> {
            try {
                BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String gg;
                while ((gg = buff.readLine()) != null) {
                    System.out.println("服务端说" + gg);
                }
            } catch (Exception e) {
                System.out.println("多线程异常");
               // 停止线程
            }
        }).start();

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要说话");
        while(true){
            String line = sc.nextLine();

            printWriter.println(line);
            if ("886".equalsIgnoreCase(line)){
                break;
            }
        }
        socket.close();
        printWriter.close();
        sc.close();
    }
}