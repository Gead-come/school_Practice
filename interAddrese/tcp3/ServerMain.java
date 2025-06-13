package interAddrese.tcp3;

public class ServerMain {
    public static void main(String[] args) {
        ChatServer server = new ChatServer(9999);
        server.start();
    }
}
