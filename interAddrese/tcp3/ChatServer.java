package interAddrese.tcp3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    private  int port;
    private final Set<ClientHandler>clients = ConcurrentHashMap.newKeySet();
    private  final ExecutorService threadpool = Executors.newCachedThreadPool();
    public  ChatServer(int port){
        this.port = port;
    }
    public void start(){
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("服务器启动成功:"+port);
            while(true) {
                Socket clientsocket = serverSocket.accept();
                ClientHandler handler = new ClientHandler(clientsocket, this);
                clients.add(handler);
                threadpool.execute( handler);
                System.out.println("有新客户端链接:" + clientsocket.getRemoteSocketAddress());
            }
            }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            threadpool.shutdown();
        }
    }
     public void broadcast(String message, ClientHandler sender){
         for (ClientHandler client : clients) {
             if (client!= sender){
                 client.send(message);
             }
         }
     }
     public void removeClient(ClientHandler handler){
          clients.remove(handler);
     }

}
