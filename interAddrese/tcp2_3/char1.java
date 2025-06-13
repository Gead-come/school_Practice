package interAddrese.tcp2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class char1 {
    private Socket  socket;

    private String name;

    public char1(Socket socket,String name){
        this.socket = socket;
        this.name = name;
    }
    public void start() throws IOException {
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
