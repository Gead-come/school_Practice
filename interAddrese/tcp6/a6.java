package interAddrese.tcp6;

import java.io.*;
import java.net.Socket;

public class a6 {
    public static void main(String[] args) throws IOException {


        // ... existing code ...
        Socket socket = new Socket("127.0.0.1", 8888);
        System.out.println("客户端启动");
        BufferedInputStream io = new BufferedInputStream(new FileInputStream("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_001.png"));
        BufferedOutputStream ot = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = io.read(bytes)) != -1) {
            ot.write(bytes, 0, len);
        }

        ot.flush();
// 获取输入流，并读取服务器返回的消息
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String s = reader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.err.println("读取服务器响应时发生错误：" + e.getMessage());
        } finally {
            // 显式关闭 socket 资源
            try {
                socket.close();
            } catch (IOException e) {
                System.err.println("关闭 socket 时出错：" + e.getMessage());
            }
        }
    }
}