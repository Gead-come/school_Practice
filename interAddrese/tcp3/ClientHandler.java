package interAddrese.tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements  Runnable{
    private final Socket socket;
    private final ChatServer server;
    private PrintWriter writer;
    public ClientHandler(Socket socket, ChatServer Server) {
        this.socket = socket;
        this.server = Server;

    }

    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            writer  = new PrintWriter(socket.getOutputStream(), true);
            writer.println("欢迎进入聊天室");
            String  msg;
            while((msg=reader.readLine())!= null){
                System.out.println("收到消息"+msg);
                server.broadcast(msg, this);
            }
        }catch (IOException e){
            System.out.println("客户端异常"+socket.getRemoteSocketAddress());
        }finally {
            server.removeClient(this);
            try{
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }public void send(String msg){
        if (writer!= null){
            writer.println(msg);
        }
    }
}
