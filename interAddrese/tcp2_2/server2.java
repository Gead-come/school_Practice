package interAddrese.tcp2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server2 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端启动,等待数据");
        Socket accept = serverSocket.accept();
        System.out.println("客户端连接成功");

        new Thread(() -> {
            try {
                BufferedReader buff = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                String gg;
                while ((gg = buff.readLine()) != null) {
                    System.out.println("客户端说：" + gg);
                }

            } catch (Exception e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }).start();
        PrintWriter printWriter = new PrintWriter(accept.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            printWriter.println(line);
            if ("goodbye".equalsIgnoreCase(line)){
                break;
            }
        }

        serverSocket.close();
        sc.close();
        printWriter.close();
    }
}