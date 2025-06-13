package interAddrese.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class clients {
    public static void main(String[] args) throws IOException {

           // 客户端 Tcp的学习

        Socket socket = new Socket("127.0.0.1", 8888);

          // 获取输出流
        OutputStream out = socket.getOutputStream();

          // 创建一个打印流,  将打印流包装成 PrintStream,作用为 自动刷新
        PrintWriter ps = new PrintWriter(out, true);

        Scanner sc = new Scanner(System.in);

        System.out.println("話を入力してください");
       while(true){
           String s = sc.nextLine();
           ps.println(s);
           if ("bye".equalsIgnoreCase(s)){
               break;
           }
       }
       socket.close();
       ps.close();
    }
}
