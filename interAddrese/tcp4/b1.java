package interAddrese.tcp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class b1 {
    public static void main(String[] args) throws IOException {
        String name = UUID.randomUUID().toString().replace("-", ""); // 获取一个随机的UUID
      try(
              ServerSocket serverSocket = new ServerSocket(10086);
              Socket accept = serverSocket.accept();
              BufferedInputStream to = new BufferedInputStream(accept.getInputStream());
              BufferedOutputStream io = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Webデザイン科\\Desktop\\Java&web\\+"+name+".png"));
              BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()))) {
          byte[] bytes = new byte[1024];
          int len;
          while ((len = to.read(bytes)) != -1) {
              io.write(bytes, 0, len);
              io.flush();

          }
          bf.write("文件上传成功");
          bf.newLine();
          bf.flush();

      }catch (Exception e){
          e.printStackTrace();
      }

    }
}
