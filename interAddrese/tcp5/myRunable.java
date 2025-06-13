package interAddrese.tcp5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class myRunable implements Runnable{

    private final Socket accept;

    public myRunable(Socket accept){
        this.accept = accept;
    }
    @Override
    public void run() {
        try {
            System.out.println("客户端连接成功");

            BufferedInputStream io = new BufferedInputStream(accept.getInputStream());
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream it = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Webデザイン科\\Desktop\\lalalalal\\新しいフォルダー\\111\\"+name+".png"));
            byte[] bytes = new byte[1024];
            int len;
            while((len = io.read(bytes))!= -1){
                it.write(bytes, 0, len);

            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("文件上传成功");
            bw.newLine();   // 刷新缓冲区
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
           if (accept != null){
               try {
                   accept.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
        }


}
}
