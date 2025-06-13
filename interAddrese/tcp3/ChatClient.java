package interAddrese.tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    private final String host;
    private final int port;

    public ChatClient(String host, int port) {
        this.host = host;
        this.port = port;
    }
    public void start(){
        try(Socket socket = new Socket(host, port)){
            System.out.println("连接聊天室");
            new Thread(()->{
                try(
                   BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));)
                    {
                         String msg;
                         while((msg = reader.readLine())!=null){
                             System.out.println(msg);
                    }
                    }catch (IOException e){
                    System.out.println("接收线程异常：" + e.getMessage());
                }
                }).start();

            try(PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                    Scanner sc = new Scanner(System.in);)
            {
              while(true){
                  String input = sc.nextLine();
                  writer.println(input);
                  if("bye".equals(input))break;
              }
            }
            }
        catch(Exception e){
            System.out.println("连接失败"+e.getMessage());
        }
        }
    }

