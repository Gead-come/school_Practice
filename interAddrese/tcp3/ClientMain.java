package interAddrese.tcp3;

public class ClientMain {
    public static void main(String[] args) {

        ChatClient client = new ChatClient("127.0.0.1", 9999);
        client.start();
    }
}
