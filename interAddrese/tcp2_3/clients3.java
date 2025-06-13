package interAddrese.tcp2_3;

import java.io.IOException;
import java.net.Socket;

public class clients3 {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1", 9999);
        char1 clients = new char1(socket, "服务端");
        clients.start();
    }
}
