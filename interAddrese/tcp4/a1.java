package interAddrese.tcp4;

import java.io.*;
import java.net.Socket;

public class a1 {
    public static void main(String[] args) throws IOException {


        try (Socket socket = new Socket("172.20.10.15", 10086);
             BufferedInputStream io = new BufferedInputStream(new FileInputStream("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_001.png"));
             BufferedOutputStream to = new BufferedOutputStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = io.read(bytes)) != -1) {
                to.write(bytes, 0, len);
                to.flush();
            }
            socket.shutdownOutput();
            String line = reader.readLine();
            System.out.println(line);
        }  catch (IOException e) {
            e.printStackTrace();
        }


    }
}